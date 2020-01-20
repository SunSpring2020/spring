package com.java.spring.dao;

import com.java.spring.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SysUserDao extends JpaRepository<SysUser,String>, JpaSpecificationExecutor<SysUser> {


}
