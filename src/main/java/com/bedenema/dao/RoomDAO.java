package com.bedenema.dao;

import com.bedenema.model.Room;

import java.sql.SQLException;
import java.util.ArrayList;

public class RoomDAO extends DAO{

    public RoomDAO(){
        super();
    }
    public  ArrayList<Room> getRoomList() throws SQLException {
        connect();
        st = conn.createStatement();
        sql = "select * from tblrooms";
        rs = st.executeQuery(sql);
        conn.close();

        ArrayList<Room> arr =new ArrayList<>();
        while (rs.next()){
            Room r = new Room();
            r.setId(rs.getInt("id"));
            arr.add(r);
        }
        return arr;
    }

    public Room getRoom(int id){
        Room r =new Room();
        return r;
    }

    public void newRoom(){

    }
    public void updateRoom(int id){

    }

//    public static void main(String[] args) throws SQLException {
//        RoomDAO rd = new RoomDAO();
//        System.out.println(rd.getRoomList().get(0).getId());
//    }
}
