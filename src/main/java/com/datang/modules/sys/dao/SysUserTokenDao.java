package com.datang.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.datang.modules.sys.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);
	
}
