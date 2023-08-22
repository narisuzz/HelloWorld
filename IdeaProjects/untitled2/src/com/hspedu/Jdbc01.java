package com.hspedu;

import java.sql.*;
import java.util.Properties;

// 这是第一个Jdbc 完成简单的操作
public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        //注册驱动
        //
        Driver driver = new com.mysql.cj.jdbc.Driver();
        //得到链接
        String url = "jdbc:mysql://localhost:3306/nrs_bd02";
        Properties properties = new Properties();
        properties.setProperty("user", "root");//用户
        properties.setProperty("password", "112288we");//密码
        Connection connect = driver.connect(url,properties);
        //Connection connect = DriverManager.getConnection(url,"root","nrs");
        //执行sql
        String sql = "insert into actor values (null,'哪吒','男'," +
                "'1900-10-10','110')";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);//影响行数
        System.out.println(rows > 0 ? "成功" : "失败");

        //关闭链接
        statement.close();
        connect.close();
    }
}
