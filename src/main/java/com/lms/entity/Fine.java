package com.lms.entity;

public class Fine {
    private static int ID_GENERATOR = 0;
    private int id;
    private double finePerDay;
    private BookCheckout bookCheckout;

    public Fine(double finePerDay, BookCheckout bookCheckout) {
        this.id = ++ID_GENERATOR;
        this.finePerDay = finePerDay;
        this.bookCheckout = bookCheckout;
    }

    public int getId() {
        return id;
    }

    public double calculateFine() {
        return 0.0;
    }

    public double getFinePerDay() {
        return finePerDay;
    }

    public void setFinePerDay(double finePerDay) {
        this.finePerDay = finePerDay;
    }

    public BookCheckout getBookCheckout() {
        return bookCheckout;
    }

    public void setBookCheckout(BookCheckout bookCheckout) {
        this.bookCheckout = bookCheckout;
    }
}
