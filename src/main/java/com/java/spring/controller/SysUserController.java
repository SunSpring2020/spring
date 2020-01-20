package com.java.spring.controller;

import com.java.spring.domain.SysUser;
import com.java.spring.from.SysUserFrom;
import com.java.spring.services.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private ISysUserService userService;

    @RequestMapping("/save")
    public Boolean save(SysUser sysUser){
        Boolean save = userService.save(sysUser);
        return save;
    }

    @RequestMapping("/delete")
    public Boolean delete(String id){
        Boolean delete = userService.deleteById(id);
        return delete;
    }

    @RequestMapping("/getOne")
    public SysUser getOne(String id){
        SysUser sysUser = userService.getById(id);
        return sysUser;
    }

    @RequestMapping("/query")
    public Page<SysUser> query(SysUserFrom userFrom){
        Page<SysUser> query = userService.query(userFrom);
        return query;
    }

}
