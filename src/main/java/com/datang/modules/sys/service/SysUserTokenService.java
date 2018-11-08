package com.datang.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.datang.common.utils.Result;
import com.datang.modules.sys.entity.SysUserTokenEntity;

/**
 * 用户Token
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	Result createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

}
