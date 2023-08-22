package com.hspedu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConn {
    public void connect01() throws SQLException {
        com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/nrs_bd02";
        Properties properties = new Properties();
        properties.setProperty("user", "root");// 用户
        properties.setProperty("password", "112288we");// 密码
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

    public void connect02() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/nrs_bd02";
        Properties properties = new Properties();
        properties.setProperty("user", "root");// 用户
        properties.setProperty("password", "112288we");// 密码
        Connection connect = driver.connect(url, properties);
        System.out.println("方式2=" + connect);
    }

    public void connect03() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/nrs_bd02";
        String user = "root";
        String password = "112288we";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("第三种方法=" + connection);
    }

    public  void connect04() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("方式5" + connection);
    }

    public static void main(String[] args) {
        JdbcConn jdbcConn = new JdbcConn();
        try {
            jdbcConn.connect01();
            jdbcConn.connect02();
            jdbcConn.connect03();
            jdbcConn.connect04();
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
