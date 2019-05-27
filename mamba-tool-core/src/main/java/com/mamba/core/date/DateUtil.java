package com.mamba.core.date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/5/23 11:39
 * @description 日期相关工具类
 */
public final class DateUtil {

    private static Logger log = LoggerFactory.getLogger(DateUtil.class);

    public static LocalDate getCurrentLocalDate() {
        return LocalDate.now();
    }

    public static String getFormatDate() {

        return LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE);
    }
}