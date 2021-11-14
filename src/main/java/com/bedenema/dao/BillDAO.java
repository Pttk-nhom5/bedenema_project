package com.bedenema.dao;

import com.bedenema.model.Bill;

import java.util.ArrayList;

public class BillDAO {

    public BillDAO(){

    }
    public static ArrayList<Bill> getUnprintedBill(){
        ArrayList<Bill> arr = new ArrayList<>();
        return arr;
    }
     public static Bill getBill(int id){
        Bill b = new Bill();
        return b;
     }

     public static void newBill(){

     }

     public static void updateBill(int BillID){

     }
}
