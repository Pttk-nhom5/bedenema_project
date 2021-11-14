package com.bedenema.model;

import java.time.LocalDateTime;

public class Client {
    private int id, point;
    private String fullName, phone, personalId, gender, email, password, address;
    private LocalDateTime birthday;
    private boolean isMember;

    public Client(int id, int point, String fullName, String phone, String personalId, String gender, String email, String password, String address, LocalDateTime birthday, boolean isMember) {
        this.id = id;
        this.point = point;
        this.fullName = fullName;
        this.phone = phone;
        this.personalId = personalId;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.address = address;
        this.birthday = birthday;
        this.isMember = isMember;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }
}
