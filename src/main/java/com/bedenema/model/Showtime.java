package com.bedenema.model;

//import jdk.vm.ci.meta.Local;

import java.time.LocalDateTime;

public class Showtime {
    private int id;
    private Room room;
    private Film film;
    private LocalDateTime startTime, endTime;

    public Showtime(){

    }

    public Showtime(int id, Room room, Film film, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = id;
        this.room = room;
        this.film = film;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
