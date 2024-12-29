package com.lms.entity;

import com.lms.constants.BookStatus;

public class BookItem {
    private static int ID_GENERATOR = 0;
    private int id;
    private BookStatus bookStatus;
    private Book book;

    public BookItem(BookStatus bookStatus, Book book) {
        this.id = ++ID_GENERATOR;
        this.bookStatus = bookStatus;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public boolean isAvailable() {
        return true;
    }
}
