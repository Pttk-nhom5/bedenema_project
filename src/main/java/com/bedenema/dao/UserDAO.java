package com.bedenema.dao;

import com.bedenema.model.User;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO extends DAO{
    private String sql;
    private Statement st;
    private ResultSet rs;

    public UserDAO() throws SQLException {
        super();

    }

    public User userAuthen(String username, String password) throws SQLException {
        connect();
        User u = new User();
        st = conn.createStatement();
        sql="select *from tblusers WHERE username='" + username + "' AND password='" +password+ "'";
        rs = st.executeQuery(sql);
        while (rs.next()){
           u.setId(rs.getInt("id"));
           u.setUsername((rs.getString("username")));
           u.setPassword((rs.getString("password")));
           if(rs.getInt("position")==1){
               u.setPosition("Manager");
           }else u.setPosition("Staff");
        }
        conn.close();
        return u;
    }

    public void newUser(){

    }

    public void updateUser(int id){

    }


}
