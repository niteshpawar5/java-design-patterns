// File: DBConnectionManager.java
// Program 4: Domain Singleton - Database Connection Manager

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

    private static volatile DBConnectionManager instance;

    private static final String URL = "jdbc:mysql://localhost:3306/mlm_system";
    private static final String USER = "root";
    private static final String PASS = "password";

    private DBConnectionManager() {
        System.out.println("Database Manager Created");
    }

    /**
     * Thread-safe Singleton instance creation
     */
    public static DBConnectionManager getInstance() {
        if (instance == null) {
            synchronized (DBConnectionManager.class) {
                if (instance == null) {
                    instance = new DBConnectionManager();
                }
            }
        }
        return instance;
    }

    /**
     * Provides a new DB connection
     */
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public static void main(String[] args) throws Exception {
        DBConnectionManager c1 = DBConnectionManager.getInstance();
        DBConnectionManager c2 = DBConnectionManager.getInstance();

        System.out.println(c1 == c2); 
    }
}
