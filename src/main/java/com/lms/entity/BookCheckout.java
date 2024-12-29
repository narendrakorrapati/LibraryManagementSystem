package com.lms.entity;

import com.lms.constants.CheckoutStatus;

import java.time.LocalDate;

public class BookCheckout {
    private static int ID_GENERATOR = 0;
    private int id;
    private LocalDate checkedOutOn;
    private Account checkedOutBy;
    private BookItem bookItem;
    private LocalDate returnDate;
    private int duration;
    private CheckoutStatus checkoutStatus;

    public BookCheckout(LocalDate checkedOutOn, Account checkedOutBy, BookItem bookItem, LocalDate returnDate, int duration, CheckoutStatus checkoutStatus) {
        this.id = ++ID_GENERATOR;
        this.checkedOutOn = checkedOutOn;
        this.checkedOutBy = checkedOutBy;
        this.bookItem = bookItem;
        this.returnDate = returnDate;
        this.duration = duration;
        this.checkoutStatus = checkoutStatus;
    }

    public LocalDate getCheckedOutOn() {
        return checkedOutOn;
    }

    public void setCheckedOutOn(LocalDate checkedOutOn) {
        this.checkedOutOn = checkedOutOn;
    }

    public Account getCheckedOutBy() {
        return checkedOutBy;
    }

    public void setCheckedOutBy(Account checkedOutBy) {
        this.checkedOutBy = checkedOutBy;
    }

    public BookItem getBookItem() {
        return bookItem;
    }

    public void setBookItem(BookItem bookItem) {
        this.bookItem = bookItem;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public CheckoutStatus getCheckoutStatus() {
        return checkoutStatus;
    }

    public void setCheckoutStatus(CheckoutStatus checkoutStatus) {
        this.checkoutStatus = checkoutStatus;
    }

    public int getOverdueBy() {
        return 0;
    }

    public int getId() {
        return id;
    }
}
