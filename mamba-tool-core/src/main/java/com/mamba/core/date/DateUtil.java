package com.mamba.core.date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/5/23 11:39
 * @description 日期相关工具类
 */
public final class DateUtil {

    private static Logger log = LoggerFactory.getLogger(DateUtil.class);

    //=============java 8=================

    public static String getFormatDateTime(LocalDateTime var1, String pattern) {
        DateTimeFormatter var2 = DateTimeFormatter.ofPattern(pattern);
        return var1.format(var2);
    }

    public static LocalDateTime getCurrentLocalDateTime() {
        return LocalDateTime.now();
    }

    //============ before java 8==========
    public static Date getCurrentDate() {
        return new Date(System.currentTimeMillis());
    }

    public static String getFormatDate(Date var3, String pattern) {
        DateFormat var4 = new SimpleDateFormat(pattern);
        return var4.format(var3);
    }

}