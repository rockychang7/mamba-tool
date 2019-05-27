package com.mamba.date;

import com.mamba.core.date.DateUtil;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/5/27 14:54
 */
public class DateUtilDemo {
    @Test
    public void testGetCurrentDate() {
        Date currentDate = DateUtil.getCurrentDate();
        System.out.println(currentDate.toString());
    }

    @Test
    public void testGetFormatDateTime() {
        String formatDateTime = DateUtil.getFormatDateTime(LocalDateTime.of(2019, 10, 15, 12, 25, 23),"yyyy-MM-dd hh:mm:ss");
        System.out.println("=====formatDateTime====" + formatDateTime);
    }

    @Test
    public void testFormatDate() {
        String formatDateTime = DateUtil.getFormatDate(new Date(),"yyyy-MM-dd hh:mm:ss");
        System.out.println("=====formatDate====" + formatDateTime);
    }


}