package com.bedenema.model;

import java.time.LocalDateTime;

public class Film {
    private int id, duration;
    private String name, director, country, category, poster;
    private LocalDateTime releaseDate;
    private boolean isShowing;

    public Film(int id, int duration, String name, String director, String country, String category, String poster, LocalDateTime releaseDate, boolean isShowing) {
        this.id = id;
        this.duration = duration;
        this.name = name;
        this.director = director;
        this.country = country;
        this.category = category;
        this.poster = poster;
        this.releaseDate = releaseDate;
        this.isShowing = isShowing;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isShowing() {
        return isShowing;
    }

    public void setShowing(boolean showing) {
        isShowing = showing;
    }
}
