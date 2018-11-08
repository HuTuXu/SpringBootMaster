package com.datang.modules.sys.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.datang.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
