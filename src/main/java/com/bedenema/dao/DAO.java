package com.bedenema.dao;

import java.sql.*;

public class DAO<conn> {

    //    String jdbcUrl = "jdbc:mariadb://localhost:3306/bedenema_db";
//    String username = "root";
//    String password ="";
    String jdbcUrl = "jdbc:mariadb://192.168.10.10:3306/bedenema_db";
    String username = "homestead";
    String password = "secret";
    Connection conn;


    public DAO() {

    }

    public void connect() throws SQLException {
        conn = DriverManager.getConnection(jdbcUrl, username, password);
    }
}
