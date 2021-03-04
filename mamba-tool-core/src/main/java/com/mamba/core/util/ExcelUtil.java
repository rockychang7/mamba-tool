package com.mamba.core.util;

import java.util.List;

/**
 * @Author JoeBig7
 * @date 2021/2/5 19:59:08
 */
public class ExcelUtil {

    public static void main(String[] args) {
        // 设定Excel文件所在路径
        String excelFileName = "E:\\影像工作室id(筛选).xlsx";
        // 读取Excel文件内容
        List<String> readResult = ExcelReader.readExcel(excelFileName);


        StringBuilder sb = new StringBuilder();
        readResult.forEach(a->{
            sb.append(a).append(",");
        });

        System.out.println(sb.toString());
    }
}
