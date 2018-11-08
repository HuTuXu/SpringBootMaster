package com.datang.common.validator;

import com.datang.common.exception.ResultException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 * @author xuchangjiang
 * @email 13485386017@163.com
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
