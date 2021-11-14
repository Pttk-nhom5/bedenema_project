package com.bedenema.dao;

import com.bedenema.model.Seat;

import java.util.ArrayList;

public class SeatDAO {

    public SeatDAO(){

    }
    public static Seat getSeat(int id){
        Seat s = new Seat();
        return s;
    }

    public static ArrayList<Seat> getSeatList(int roomid){
        ArrayList<Seat> arr = new ArrayList<>();
        return arr;
    }

    public static void updateSeat(){

    }
}
