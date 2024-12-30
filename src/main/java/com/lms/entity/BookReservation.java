package com.lms.entity;

import com.lms.constants.ReservationStatus;

import java.time.LocalDate;

public class BookReservation {
    private static int ID_GENERATOR = 0;
    private int id;
    private LocalDate reservedOn;
    private Account reservedBy;
    private BookItem bookItem;
    private ReservationStatus reservationStatus;

    public BookReservation(LocalDate reservedOn, Account reservedBy, BookItem bookItem, ReservationStatus reservationStatus) {
        this.id = ++ID_GENERATOR;
        this.reservedOn = reservedOn;
        this.reservedBy = reservedBy;
        this.bookItem = bookItem;
        this.reservationStatus = reservationStatus;
    }

    public int getId() {
        return id;
    }

    public LocalDate getReservedOn() {
        return reservedOn;
    }

    public void setReservedOn(LocalDate reservedOn) {
        this.reservedOn = reservedOn;
    }

    public Account getReservedBy() {
        return reservedBy;
    }

    public void setReservedBy(Account reservedBy) {
        this.reservedBy = reservedBy;
    }

    public BookItem getBookItem() {
        return bookItem;
    }

    public void setBookItem(BookItem bookItem) {
        this.bookItem = bookItem;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }


    @Override
    public String toString() {
        return "BookReservation{" +
                "id=" + id +
                ", reservedOn=" + reservedOn +
                ", reservedBy=" + reservedBy +
                ", bookItem=" + bookItem +
                ", reservationStatus=" + reservationStatus +
                '}';
    }
}
