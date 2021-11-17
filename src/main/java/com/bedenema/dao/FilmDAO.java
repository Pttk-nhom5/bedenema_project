package com.bedenema.dao;

import com.bedenema.model.Film;

import java.sql.SQLException;
import java.util.ArrayList;

public class FilmDAO extends DAO {

    public FilmDAO(){
        super();

    }
    public  Film getFIlm(int id) throws SQLException {
        connect();
        st = conn.createStatement();
        sql = "Select * from tblfilms where id ='" + id + "'";
        rs = st.executeQuery(sql);
        conn.close();
        rs.next();
        Film f = new Film();
        f.setId(rs.getInt("id"));
        f.setName(rs.getString("name"));
        return f;
    }

    public  ArrayList<Film> getFilmList(){
        ArrayList<Film> arr = new ArrayList<>();
        return arr;
    }

    public  void newFilm(){

    }

    public  void updateFilm(int id){

    }

    public void deleteFilm(int id){

    }

    public static void main(String[] args) throws SQLException {
        FilmDAO fd = new FilmDAO();
        System.out.println(fd.getFIlm(1).getId() + " " + fd.getFIlm(1).getName());
    }
}
