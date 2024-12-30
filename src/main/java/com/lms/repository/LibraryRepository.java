package com.lms.repository;

import com.lms.entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryRepository {
    private Library library;
    private Map<Account, List<BookReservation>> reservationMap;
    private Map<Account, List<BookCheckout>> checkoutMap;
    private Map<BookItem, List<BookReservation>> bookItemReservationMap;

    public LibraryRepository(Library library) {
        this.library = library;
        this.reservationMap = new HashMap<>();
        this.checkoutMap = new HashMap<>();
        this.bookItemReservationMap = new HashMap<>();
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Map<Account, List<BookReservation>> getReservationMap() {
        return reservationMap;
    }

    public void setReservationMap(Map<Account, List<BookReservation>> reservationMap) {
        this.reservationMap = reservationMap;
    }

    public Map<Account, List<BookCheckout>> getCheckoutMap() {
        return checkoutMap;
    }

    public void setCheckoutMap(Map<Account, List<BookCheckout>> checkoutMap) {
        this.checkoutMap = checkoutMap;
    }

    public Map<BookItem, List<BookReservation>> getBookItemReservationMap() {
        return bookItemReservationMap;
    }

    public void setBookItemReservationMap(Map<BookItem, List<BookReservation>> bookItemReservationMap) {
        this.bookItemReservationMap = bookItemReservationMap;
    }

    public void saveBookReservation(BookReservation bookReservation) {
        reservationMap.computeIfAbsent(bookReservation.getReservedBy(), l -> new ArrayList<>());
        reservationMap.get(bookReservation.getReservedBy()).add(bookReservation);
        bookItemReservationMap.computeIfAbsent(bookReservation.getBookItem(), l -> new ArrayList<>());
        bookItemReservationMap.get(bookReservation.getBookItem()).add(bookReservation);
    }

    public List<BookReservation> getReservationsForBookItem(BookItem bookItem) {
        return bookItemReservationMap.getOrDefault(bookItem, new ArrayList<>());
    }
}
