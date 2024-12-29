package com.lms.repository;

import com.lms.entity.Account;
import com.lms.entity.BookCheckout;
import com.lms.entity.BookReservation;
import com.lms.entity.Library;

import java.util.HashMap;
import java.util.Map;

public class LibraryRepository {
    private Library library;
    private Map<Account, BookReservation> reservationMap;
    private Map<Account, BookCheckout> checkoutMap;

    public LibraryRepository(Library library) {
        this.library = library;
        this.reservationMap = new HashMap<>();
        this.checkoutMap = new HashMap<>();
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Map<Account, BookReservation> getReservationMap() {
        return reservationMap;
    }

    public void setReservationMap(Map<Account, BookReservation> reservationMap) {
        this.reservationMap = reservationMap;
    }

    public Map<Account, BookCheckout> getCheckoutMap() {
        return checkoutMap;
    }

    public void setCheckoutMap(Map<Account, BookCheckout> checkoutMap) {
        this.checkoutMap = checkoutMap;
    }
}
