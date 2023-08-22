package com.hspedu;

import java.util.SortedMap;
//模拟mysql数据库实现 jdbc
public class MysqlJdbcimpl implements  JdbcInterfac {

    @Override
    public Object getConnection() {
        System.out.println("得到mysql的链接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成mysql增删改察");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql的链接");
    }
}
