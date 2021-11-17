package com.bedenema.dao;

import com.bedenema.model.Bill;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BillDAO extends DAO {

    public BillDAO(){
        super();
    }
    public static ArrayList<Bill> getUnprintedBill(){
        ArrayList<Bill> arr = new ArrayList<>();
        return arr;
    }
     public  Bill getBill(int id) throws SQLException {
        connect();
        st = conn.createStatement();
        sql = "select * from tblbills where id = '"+ id +"'";
        rs = st.executeQuery(sql);
        rs.next();
        Bill b = new Bill();
        b.setId(rs.getInt("id"));
         conn.close();
        return b;
     }

     public static void newBill(){

     }

     public static void updateBill(int BillID){

     }

//    public static void main(String[] args) throws SQLException {
//        BillDAO bd = new BillDAO();
//        System.out.println(bd.getBill(1).getId());
//    }
}
