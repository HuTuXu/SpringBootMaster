package com.datang.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.datang.modules.sys.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
