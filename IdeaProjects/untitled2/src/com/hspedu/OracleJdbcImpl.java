package com.hspedu;
//模拟oracle数据库实现jdbc
public class OracleJdbcImpl implements JdbcInterfac{

    @Override
    public Object getConnection() {
        System.out.println("得到oracle的链接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成oracle增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭oracle 的链接");
    }
}
