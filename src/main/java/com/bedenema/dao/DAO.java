package com.bedenema.dao;

import java.sql.*;

public class DAO<conn> {

    private String jdbcUrl = "jdbc:mariadb://localhost:3306/bedenema_db";
    private    String username = "root";
    private    String password ="";
    private Connection conn;

    public DAO() throws SQLException {
        conn = DriverManager.getConnection(jdbcUrl,username,password);
    }

}
