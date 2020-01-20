package com.java.spring.services;

import com.java.spring.dao.SysUserDao;
import com.java.spring.domain.SysUser;
import com.java.spring.from.SysUserFrom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Service
public class SysUserService implements ISysUserService {

    @Autowired
    private SysUserDao userDao;

    @Override
    public SysUser getById(String id) {
        SysUser sysUser = userDao.getOne(id);
        return sysUser;
    }

    @Override
    public Boolean deleteById(String id) {
        try{
            userDao.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Page<SysUser> query(SysUserFrom sysUser) {
        Specification<SysUser> specification = (root, query, cb) -> {
            Predicate namePath = root.isNotNull();
            if (sysUser.getIdCard() != null && !"".equals(sysUser.getIdCard())){
                namePath = cb.and(namePath,cb.equal(root.get("idCard"),sysUser.getIdCard()));
            }
            if (sysUser.getAddreess() != null && !"".equals(sysUser.getAddreess())){
                namePath = cb.and(namePath,cb.like(root.get("addreess"),"%" + sysUser.getAddreess() + "%"));
            }
            return query.where(namePath).getRestriction();
        };
        Page<SysUser> all = userDao.findAll(specification, PageRequest.of(sysUser.getPage() - 1, sysUser.getLimit()));
        return all;
    }

    @Override
    public Boolean save(SysUser sysUser) {
        try{
            userDao.save(sysUser);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
