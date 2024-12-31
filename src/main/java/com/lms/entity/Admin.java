package com.lms.entity;

import com.lms.service.LibraryService;
import com.lms.service.SearchService;

public class Admin extends Account{


    public Admin(String username, String password, Address address, String email, LibraryService libraryService, SearchService searchService) {
        super(username, password, address, email, libraryService, searchService);
    }

    public BookReservation reserveBook(Account account, BookItem bookItem) {
        return getLibraryService().reserveBook(account, bookItem);
    }

    public BookCheckout checkOutBook(Account account, BookItem bookItem) {
        return getLibraryService().checkOutBook(account, bookItem);
    }

    public void returnBook(Account account, BookItem bookItem) {
        getLibraryService().returnBook(account, bookItem);
    }
}
