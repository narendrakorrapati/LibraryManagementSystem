package com.lms.service;

import com.lms.constants.SubjectCategory;
import com.lms.entity.*;
import com.lms.repository.LibraryRepository;

import java.time.LocalDate;
import java.util.List;

public class LibraryService {

    private LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public List<Book> searchBookByTitle(String title) {
        return null;
    }

    public List<Book> searchBookByAuthor(String Author) {
        return null;
    }

    public List<Book> searchBookBySubjectCategory(SubjectCategory subjectCategory) {
        return null;
    }

    public List<Book> searchBookByPublicationDate(LocalDate publicationDate) {
        return null;
    }

    public BookReservation reserveBook(Account account, BookItem bookItem) {
        return null;
    }

    public BookCheckout checkOutBook(Account account, BookItem bookItem) {
        return null;
    }

    public void returnBook(Account account, BookItem bookItem) {

    }
}
