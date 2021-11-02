package com.mamba.core.string;

import java.util.Objects;

/**
 * @Author JoeBig7
 * @date 2021/11/2 19:46:38
 * @description String tool
 */
public class StringUtils {


    /**
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (Objects.isNull(str) || str.isEmpty()) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isEmpty("xx"));
        System.out.println(isEmpty(""));
    }
}
