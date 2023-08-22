package com.hspedu;

public interface JdbcInterfac {
    public Object getConnection();//链接
    public void crud();
    public void close();//关闭链接
}
