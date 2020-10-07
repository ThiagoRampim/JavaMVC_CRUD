package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    public Connection conecta() {
        try {
            String url = "jdbc:postgresql://localhost:5432/universidade";
            String usr = "postgres";
            String pw = "123";
            return DriverManager.getConnection(url, usr, pw);
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
