package com.java.spring.services;

import com.java.spring.domain.SysUser;
import com.java.spring.from.SysUserFrom;
import org.springframework.data.domain.Page;

public interface ISysUserService {

    SysUser getById(String id);

    Boolean deleteById(String id);

    Page<SysUser> query(SysUserFrom sysUser);

    Boolean save(SysUser sysUser);

}
