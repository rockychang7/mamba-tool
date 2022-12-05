package com.mamba.core.number;

import java.util.Random;

/**
 * @Author JoeBig7
 * @date 2022/12/2 14:26:49
 * @description 数字相关工具类
 */
public class NumberUtils {

    /**
     * 生成随机位数的数字
     */
    public static Integer randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = 0;
        randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
