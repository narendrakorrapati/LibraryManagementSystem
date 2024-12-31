package com.lms.entity;

import com.lms.service.LibraryService;
import com.lms.service.SearchService;

public class Member extends Account{

    public Member(String username, String password, Address address, String email, LibraryService libraryService, SearchService searchService) {
        super(username, password, address, email, libraryService, searchService);
    }

    public BookReservation reserveBook(BookItem bookItem) {
       return getLibraryService().reserveBook(this, bookItem);
    }

    public BookCheckout checkOutBook(BookItem bookItem) {
        return getLibraryService().checkOutBook(this, bookItem);
    }

    public void returnBook(BookItem bookItem) {
        getLibraryService().returnBook(this, bookItem);
    }
}
