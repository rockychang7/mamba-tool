package com.mamba.db.dialect;

import java.util.stream.Stream;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/5/17 14:29
 * 数据库方言枚举
 */
public enum DialectEnum {

    MySql("com.mysql.jdbc.Driver");


    private String dialect;


    DialectEnum(String dialect) {

        this.dialect = dialect;
    }


    public String getDialectDriver() {
        return dialect;
    }

    public static void main(String[] args) {
        System.out.println(MySql.getDialectDriver());
    }
}
