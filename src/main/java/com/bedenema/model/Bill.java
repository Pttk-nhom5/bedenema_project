package com.bedenema.model;

import java.time.LocalDateTime;

public class Bill {
    private int id, paymentType;
    private Client client;
    private User user;
    private double price;
    private LocalDateTime paymentDate;
    private Ticket[] tickets;
    private UsedCombo[] usedCombos;
    private UsedFood[] usedFoods;

    public Bill(){

    }
    public Bill(int id, int paymentType, Client client, User user, double price, LocalDateTime paymentDate, Ticket[] tickets, UsedCombo[] usedCombos, UsedFood[] usedFoods) {
        this.id = id;
        this.paymentType = paymentType;
        this.client = client;
        this.user = user;
        this.price = price;
        this.paymentDate = paymentDate;
        this.tickets = tickets;
        this.usedCombos = usedCombos;
        this.usedFoods = usedFoods;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public UsedCombo[] getUsedCombos() {
        return usedCombos;
    }

    public void setUsedCombos(UsedCombo[] usedCombos) {
        this.usedCombos = usedCombos;
    }

    public UsedFood[] getUsedFoods() {
        return usedFoods;
    }

    public void setUsedFoods(UsedFood[] usedFoods) {
        this.usedFoods = usedFoods;
    }
}
