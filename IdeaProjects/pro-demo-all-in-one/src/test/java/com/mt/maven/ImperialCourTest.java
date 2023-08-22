package com.mt.maven;
import com.mt.maven.court.util.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;

public class ImperialCourTest {
    @Test
    public void testGetConnection() {
        Connection connection = JDBCUtils.getConnection();
        System.out.println("connection=" + connection);
        JDBCUtils.releaseConnection(connection);
    }

}
