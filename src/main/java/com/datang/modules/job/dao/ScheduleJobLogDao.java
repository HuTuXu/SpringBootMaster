package com.datang.modules.job.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.datang.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
