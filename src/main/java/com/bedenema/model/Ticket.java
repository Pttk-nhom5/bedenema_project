package com.bedenema.model;

public class Ticket {
    private int id;
    private Showtime showtime;
    private Seat seat;
    private double price;

    public Ticket(){

    }
    public Ticket(int id, Showtime showtime, Seat seat, double price) {
        this.id = id;
        this.showtime = showtime;
        this.seat = seat;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
