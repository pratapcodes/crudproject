package com.CRUDproject.CRUDp.entity;

import jakarta.persistence.*;
@Entity
@Table(name="demotb")
public class Users {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int userId;
   @Column(name = "Name")
   private String name;
   @Column(name = "Address")
   private String Address;

    public Users() {
        super();
    }

    public Users(int userId, String name, String address) {
        this.userId = userId;
        this.name = name;
        Address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
