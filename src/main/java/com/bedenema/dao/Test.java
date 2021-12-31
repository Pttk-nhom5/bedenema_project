package com.bedenema.dao;

import com.bedenema.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/test")
public class Test extends DAO{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            PrintWriter writer = resp.getWriter();
            User u = userAuthen("dung0312","dung031200");
            writer.println("dsadas");
            writer.println("user: ".concat(u.getUsername()));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public User userAuthen(String username, String password) throws SQLException {
        connect();
        User u = new User();
        st = conn.createStatement();
        sql = "select *from tblusers WHERE username='" + username + "' AND password='" + password + "'";

        rs = st.executeQuery(sql);

        System.out.println(rs);

        while (rs.next()) {
            u.setId(rs.getInt("id"));
            u.setUsername((rs.getString("username")));
            u.setPassword((rs.getString("password")));
            if (rs.getInt("position") == 1) {
                u.setPosition("Manager");
            } else u.setPosition("Staff");
        }
        conn.close();
        return u;
    }
}
