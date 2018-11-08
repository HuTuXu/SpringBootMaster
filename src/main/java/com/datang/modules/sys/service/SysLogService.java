package com.datang.modules.sys.service;


import com.baomidou.mybatisplus.service.IService;
import com.datang.common.utils.PageUtils;
import com.datang.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
