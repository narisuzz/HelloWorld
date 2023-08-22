package com.mt.maven.court.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

//功能一：从数据源获取数据库链接
//功能二：将数据源绑定到班底线程（借助ThreadLocal）
//功能三：释放线程时 和本地线程接触绑定
public class JDBCUtils {

    private static DataSource datasource;//数据源成员变量
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    //静态代码块中初始化数据源
    static {
        try {
            //从 jdbc.properties 文件中读取连接数据库的信息
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            InputStream stream = classLoader.getResourceAsStream("jdbc.properties");

            Properties properties = new Properties();
            properties.load(stream);

           datasource = DruidDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = threadLocal.get();
            if (connection == null) {
                connection = datasource.getConnection();
                threadLocal.set(connection);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return connection;
    }
    public static void releaseConnection(Connection connection) {
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }
}
