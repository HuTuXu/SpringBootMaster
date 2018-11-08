package com.datang.common.utils;

/**
 * Redis所有Keys
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
