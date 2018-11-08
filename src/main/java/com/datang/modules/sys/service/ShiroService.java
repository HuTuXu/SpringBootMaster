package com.datang.modules.sys.service;

import com.datang.modules.sys.entity.SysUserEntity;
import com.datang.modules.sys.entity.SysUserTokenEntity;

import java.util.Set;

/**
 * shiro相关接口
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    SysUserTokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     * @param userId
     */
    SysUserEntity queryUser(Long userId);
}
