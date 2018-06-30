package common.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection conn = null;
    private static String url ="jdbc:mysql://xxx:3306/dbname";

    public static Connection getConnection() {
        if (null == conn) {
            synchronized (DBConnection.class) {
                if (null == conn) {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        conn = DriverManager.getConnection(url, "xxx", "xxx");
                    } catch (SQLException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}
