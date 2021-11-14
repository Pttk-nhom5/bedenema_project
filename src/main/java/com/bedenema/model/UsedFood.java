package com.bedenema.model;

public class UsedFood {
    private int id, quantity;
    private Food food;
    private double price;

    public UsedFood(int id, int quantity, Food food, double price) {
        this.id = id;
        this.quantity = quantity;
        this.food = food;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
