package com.bedenema.dao;

import com.bedenema.model.Food;

import java.util.ArrayList;

public class FoodDAO {

    public  FoodDAO(){

    }
    public static ArrayList<Food> getFoodList(){
        ArrayList<Food> arr =new ArrayList<>();
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
}
