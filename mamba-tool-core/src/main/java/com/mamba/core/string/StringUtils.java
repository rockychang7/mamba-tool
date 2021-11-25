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


    /**
     * 判断字符串是否已指定子字符串结尾
     *
     * @param str
     * @param suffixStr
     * @return
     */
    public static boolean isSuffix(String str, String suffixStr) {
        if (isEmpty(str) || isEmpty(suffixStr)) {
            return false;
        }

        int suffixStrLen = suffixStr.length();
        int strLen = str.length();

        if (strLen < suffixStrLen) {
            return false;
        } else {
            return str.substring(strLen - suffixStrLen).equalsIgnoreCase(suffixStr);
        }
    }
}
