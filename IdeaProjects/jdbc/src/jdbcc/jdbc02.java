package jdbcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc02 {
    Connection conn = null;
    Statement stmt = null;
    try{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/web_test1");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }catch( Exception e){
    }

    }
