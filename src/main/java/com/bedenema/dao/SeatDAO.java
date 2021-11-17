package com.bedenema.dao;

import com.bedenema.model.Seat;

import java.sql.SQLException;
import java.util.ArrayList;

public class SeatDAO extends DAO{

    public SeatDAO(){
        super();
    }
    public static Seat getSeat(int id){
        Seat s = new Seat();
        return s;
    }

    public ArrayList<Seat> getSeatList(int roomid) throws SQLException {
        connect();
        st = conn.createStatement();
        sql ="select * from tblseats where room_id ='"+ roomid+"'";
        rs = st.executeQuery(sql);
        conn.close();
        ArrayList<Seat> arr = new ArrayList<>();
        while(rs.next()){
            Seat s  = new Seat();
            s.setId(rs.getInt("id"));
            arr.add(s);
        }

        return arr;
    }

    public void updateSeat(){

    }

//    public static void main(String[] args) throws SQLException {
//        SeatDAO sd = new SeatDAO();
//        System.out.println(sd.getSeatList(1).get(0).getId());
//    }
}
