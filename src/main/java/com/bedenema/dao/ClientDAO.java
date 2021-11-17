package com.bedenema.dao;

import com.bedenema.model.Client;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientDAO extends DAO{

    public ClientDAO(){
        super();
    }
    public static Client getClient(String username, String password){
        Client cl = new Client();
        return cl;
    }

    public static void newClient(){

    }

    public static void updateClient(String username){

    }

    public boolean login(String email, String password) throws SQLException, ClassNotFoundException {
        connect();
        st = conn.createStatement();
        sql = "select *from tblclients WHERE email='" + email + "' AND password='" + password + "'";
        rs = st.executeQuery(sql);
        conn.close();

        if (!rs.next()) {
            return false;
        }
        return true;
    }

//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        ClientDAO cd = new ClientDAO();
//        System.out.println(cd.login("dungtn312@gmail.com","dung031200"));
//    }
}
