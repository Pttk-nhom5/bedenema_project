package com.bedenema.model;

public class UsedCombo {
    private int id, quantity;
    private Combo combo;
    private double price;

    public UsedCombo(int id, int quantity, Combo combo, double price) {
        this.id = id;
        this.quantity = quantity;
        this.combo = combo;
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

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
