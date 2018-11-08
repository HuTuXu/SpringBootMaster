package com.datang.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.datang.modules.sys.entity.SysCaptchaEntity;

import java.awt.image.BufferedImage;

/**
 * 验证码
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
public interface SysCaptchaService extends IService<SysCaptchaEntity> {

    /**
     * 获取图片验证码
     */
    BufferedImage getCaptcha(String uuid);

    /**
     * 验证码效验
     * @param uuid  uuid
     * @param code  验证码
     * @return  true：成功  false：失败
     */
    boolean validate(String uuid, String code);
}
