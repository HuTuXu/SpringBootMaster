package com.datang.modules.job.service;

import com.baomidou.mybatisplus.service.IService;
import com.datang.modules.job.entity.ScheduleJobLogEntity;
import com.datang.common.utils.PageUtils;

import java.util.Map;

/**
 * 定时任务日志
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
