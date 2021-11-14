package com.bedenema.model;

public class Combo {
    private int id;
    private double price;
    private String name;
    private Food[] foods;

    public Combo(int id, double price, String name, Food[] foods) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.foods = foods;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food[] getFoods() {
        return foods;
    }

    public void setFoods(Food[] foods) {
        this.foods = foods;
    }
}
