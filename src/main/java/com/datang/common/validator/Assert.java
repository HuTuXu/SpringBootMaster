package com.datang.common.validator;

import com.datang.common.exception.ResultException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:50
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new ResultException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new ResultException(message);
        }
    }
}
