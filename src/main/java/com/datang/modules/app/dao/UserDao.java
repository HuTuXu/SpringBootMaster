package com.datang.modules.app.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.datang.modules.app.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
