package com.mamba.core.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 * @Author JoeBig7
 * @date 2022/7/29 10:52:58
 * @descrition 日期相关工具
 */
public class DateUtils {
    /**
     * 获取两个日期之间经过的天数
     *
     * @param start
     * @param end
     * @return
     */
    public static int getPassedDays(LocalDate start, LocalDate end) {
        return Period.between(start, end).getDays();
    }

}
