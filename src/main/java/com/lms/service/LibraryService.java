package com.lms.service;

import com.lms.constants.BookStatus;
import com.lms.constants.CheckoutStatus;
import com.lms.constants.ReservationStatus;
import com.lms.entity.*;
import com.lms.repository.LibraryRepository;
import com.lms.service.strategy.search.SearchContext;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class LibraryService {
    private LibraryRepository libraryRepository;
    private FineService fineService;

    public LibraryService(LibraryRepository libraryRepository, FineService fineService) {
        this.libraryRepository = libraryRepository;
        this.fineService = fineService;
    }
    public BookReservation reserveBook(Account account, BookItem bookItem) {
        /*
        if(bookItem.isAvailable()) {
            throw new RuntimeException("Book is already available, you can checkout");
        }*/

        List<BookReservation> reservationsForBookItem = libraryRepository.getReservationsForBookItem(bookItem);

        boolean status = reservationsForBookItem.stream().anyMatch(bookReservation -> bookReservation.getReservedBy().equals(account));

        if(status) {
            throw new RuntimeException("You have already reserve this book item");
        }

        BookReservation bookReservation = new BookReservation(LocalDate.now(), account, bookItem, ReservationStatus.WAITING);
        libraryRepository.saveBookReservation(bookReservation);
        return bookReservation;
    }

    public BookCheckout checkOutBook(Account account, BookItem bookItem) {
        return null;
    }

    public Optional<FinePaymentTransaction> returnBook(Account account, BookItem bookItem) {
        List<BookCheckout> bookCheckouts = libraryRepository.getCheckoutMap().get(account);

        BookCheckout bookCheckout = bookCheckouts.stream().filter(bc -> bc.getBookItem().equals(bookItem)).findFirst().orElseThrow();
        FinePaymentTransaction finePaymentTransaction = null;

        if(bookCheckout.getOverdueBy() > 0) {
            finePaymentTransaction = fineService.processFine(bookCheckout);
        }

        bookCheckout.setCheckoutStatus(CheckoutStatus.RETURNED);
        bookCheckout.getBookItem().setBookStatus(BookStatus.AVAILABLE);

        //Send notifications for the members reserved this book item

        return Optional.ofNullable(finePaymentTransaction);
    }
}
