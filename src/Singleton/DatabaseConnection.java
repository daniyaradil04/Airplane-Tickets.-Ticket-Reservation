package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/reservation";
    private static final String JDBC_USER = "postgres";
    private static final String JDBC_PASSWORD = "2004";

    private static Connection connection;
    private DatabaseConnection(){}

    public static Connection getConnection(){
        if(connection == null){
            try{
                connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            }catch(SQLException e){
                e.printStackTrace();
                System.err.println("An error has occured while working with database" + e.getMessage());
            }
        }
        return connection;
    }

}
