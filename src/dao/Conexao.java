package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Conexao{

    private static final String URL = "jdbc:mysql://localhost:3306/databasejava";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}