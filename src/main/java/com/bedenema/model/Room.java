package com.bedenema.model;

public class Room {
    private int id, numberSeat, numberSweetBox;
    private String monitorInfo;

    public Room(){

    }
    public Room(int id, int numberSeat, int numberSweetBox, String monitorInfo) {
        this.id = id;
        this.numberSeat = numberSeat;
        this.numberSweetBox = numberSweetBox;
        this.monitorInfo = monitorInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public int getNumberSweetBox() {
        return numberSweetBox;
    }

    public void setNumberSweetBox(int numberSweetBox) {
        this.numberSweetBox = numberSweetBox;
    }

    public String getMonitorInfo() {
        return monitorInfo;
    }

    public void setMonitorInfo(String monitorInfo) {
        this.monitorInfo = monitorInfo;
    }
}
