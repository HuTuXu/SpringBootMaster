package com.datang.common.utils;

import java.util.HashMap;


/**
 * Map工具类
 * @author xuchangjiang
 * @email 13485386017@163.com
 * @since 2.0.0
 */
public class MapUtils extends HashMap<String, Object> {

    @Override
    public MapUtils put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
