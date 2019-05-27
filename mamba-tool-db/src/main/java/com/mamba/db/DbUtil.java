package com.mamba.db;

import com.mamba.db.dialect.DialectEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/5/17 14:29
 * 基于JDBC 封装对数据库的基本增删改查
 */
public class DbUtil {

    private static String url;
    private static String username;
    private static String password;
    private static Connection connection;

    public DbUtil(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    /**
     * 获取数据库连接
     *
     * @param dialectEnum
     * @return
     */
    public static Connection getDbConnection(DialectEnum dialectEnum) {
        try {
            String driver = dialectEnum.getDialectDriver();
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    public static void save() {


    }

    public static void delete() {


    }


    public static void update() {


    }


    public static void query() {


    }

}