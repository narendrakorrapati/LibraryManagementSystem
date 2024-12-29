package com.lms.entity;

import com.lms.constants.SubjectCategory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private SubjectCategory subjectCategory;
    private LocalDate publicationDate;
    private List<BookItem> bookItems;

    public Book(String title, List<Author> authors, SubjectCategory subjectCategory, LocalDate publicationDate) {
        this.title = title;
        this.authors = authors;
        this.subjectCategory = subjectCategory;
        this.publicationDate = publicationDate;
        this.bookItems = new ArrayList<>();
    }

    public List<BookItem> getBookItems() {
        return bookItems;
    }

    public void setBookItems(List<BookItem> bookItems) {
        this.bookItems = bookItems;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public SubjectCategory getSubjectCategory() {
        return subjectCategory;
    }

    public void setSubjectCategory(SubjectCategory subjectCategory) {
        this.subjectCategory = subjectCategory;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void addBookItem(BookItem bookItem) {
        bookItems.add(bookItem);
    }

    public boolean removeBookItem(BookItem bookItem) {
        return bookItems.remove(bookItem);
    }

    public int getAvailableItems() {
        return 0;
    }
}
