package com.hspedu;

public class TestJDBC {
    public static void main(String[] args) {
        //完成对mysql的链接
        JdbcInterfac jdbcInterfac = new OracleJdbcImpl();
        jdbcInterfac.getConnection();//通过接口来调用实现类
        jdbcInterfac.crud();
        jdbcInterfac.close();
        /*OracleJdbcImpl oracleJdbcimpl = new OracleJdbcImpl();
        oracleJdbcimpl.getConnection();
        oracleJdbcimpl.crud();
        oracleJdbcimpl.close();*/
    }
}
