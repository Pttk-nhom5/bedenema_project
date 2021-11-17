package com.bedenema.dao;

import com.bedenema.model.Food;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FoodDAO extends DAO{

    public  FoodDAO(){
        super();
    }

    public  ArrayList<Food> getFoodList() throws SQLException {
        connect();
        ArrayList<Food> arr =new ArrayList<>();
        st = conn.createStatement();
        sql = "select * from tblfood";
        rs = st.executeQuery(sql);
        while (rs.next()){
            Food f = new Food();
            f.setId(rs.getInt("id"));
            f.setName(rs.getString("name"));
            f.setPrice(rs.getDouble("price"));
            f.setType(rs.getInt("type"));
            f.setUnit(rs.getString("unit"));
            arr.add(f);
        }
        conn.close();
        return arr;
    }

    public static Food getFood(int id){
        Food f = new Food();
        return f;
    }
    public static void newFood(){

    }

    public static void updateFood(int id){

    }
    public static void deleteFood(int id){

    }

//    public static void main(String[] args) throws SQLException {
//        FoodDAO fd = new FoodDAO();
//        ArrayList<Food> arr = new ArrayList<>();
//        arr = fd.getFoodList();
//        System.out.println(arr.get(0).getId());
//    }
}
