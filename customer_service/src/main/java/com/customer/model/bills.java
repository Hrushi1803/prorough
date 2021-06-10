package com.customer.model;

import org.springframework.data.annotation.Id;

public class bills {


    private int id;
    private String name;
    private String date;
    private int amount;
    private String mode;

    public bills(int id, String name, String date, int amount, String mode) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.amount = amount;
        this.mode = mode;
    }

    public bills() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
