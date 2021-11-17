package com.bedenema.dao;

import com.bedenema.model.Showtime;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ShowtimeDAO extends DAO{

    public ShowtimeDAO(){

    }
    public ArrayList<Showtime> getShowTimeList() throws SQLException{
        ArrayList<Showtime> arr = new ArrayList<>();
        connect();
        st = conn.createStatement();
        LocalDateTime now = LocalDateTime.now();
        sql ="SELECT * from tblshowtimes where start_time >= '" + now + "'";
        rs = st.executeQuery(sql);
        while(rs.next()){
            Showtime showtime = new Showtime();
            showtime.setId(rs.getInt("id"));
//            showtime.setStartTime(rs.getTime("start_time"));
            arr.add(showtime);
        }
        conn.close();


        return arr;
    }

    public  Showtime getShowtime(int showtimeID){
        Showtime s = new Showtime();
        return s;
    }

    public  void newShowtime(){

    }

//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        ShowtimeDAO sd = new ShowtimeDAO();
//        ArrayList<Showtime> shows =  sd.getShowTimeList();
//        System.out.println(shows.get(0).getId());
//    }

}
