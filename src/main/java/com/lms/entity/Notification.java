package com.lms.entity;

import java.time.LocalDate;

public class Notification {

    private static int ID_GENERATOR = 0;
    private int id;
    private LocalDate createdOn;
    private String message;
    private Account account;

    public Notification(LocalDate createdOn, String message, Account account) {
        this.id = ++ID_GENERATOR;
        this.createdOn = createdOn;
        this.message = message;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
