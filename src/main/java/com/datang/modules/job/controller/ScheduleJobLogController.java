package com.datang.modules.job.controller;

import com.datang.common.utils.Result;
import com.datang.modules.job.entity.ScheduleJobLogEntity;
import com.datang.modules.job.service.ScheduleJobLogService;
import com.datang.common.utils.PageUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 定时任务日志
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
@RestController
@RequestMapping("/sys/scheduleLog")
public class ScheduleJobLogController {
	@Autowired
	private ScheduleJobLogService scheduleJobLogService;
	
	/**
	 * 定时任务日志列表
	 */
	@GetMapping("/list")
	@RequiresPermissions("sys:schedule:log")
	public Result list(@RequestParam Map<String, Object> params){
		PageUtils page = scheduleJobLogService.queryPage(params);
		
		return Result.ok().put("page", page);
	}
	
	/**
	 * 定时任务日志信息
	 */
	@GetMapping("/info/{logId}")
	public Result info(@PathVariable("logId") Long logId){
		ScheduleJobLogEntity log = scheduleJobLogService.selectById(logId);
		
		return Result.ok().put("log", log);
	}
}
