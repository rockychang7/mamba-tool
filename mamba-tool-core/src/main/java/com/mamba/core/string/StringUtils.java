package com.mamba.core.string;

import java.util.Objects;

/**
 * @Author JoeBig7
 * @date 2021/11/2 19:46:38
 * @description 字符串工具类
 */
public class StringUtils {
    /**
     * 判断字符串对象是否为空或者长度是否为0，满足一项返回true
     *
     * @param str 目标字符串
     * @return
     */
    public static boolean isEmpty(String str) {
        if (Objects.isNull(str) || str.isEmpty()) {
            return true;
        }
        return false;
    }
}
