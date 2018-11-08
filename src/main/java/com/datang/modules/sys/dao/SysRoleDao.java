package com.datang.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.datang.modules.sys.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色管理
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {
	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
