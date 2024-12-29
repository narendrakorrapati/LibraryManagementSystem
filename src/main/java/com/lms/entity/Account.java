package com.lms.entity;

import com.lms.constants.SubjectCategory;
import com.lms.service.LibraryService;

import java.time.LocalDate;
import java.util.List;

public abstract class Account {
    private String username;
    private String password;
    private Address address;
    private String email;
    private LibraryService libraryService;

    public Account(String username, String password, Address address, String email, LibraryService libraryService) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.email = email;
        this.libraryService = libraryService;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LibraryService getLibraryService() {
        return libraryService;
    }

    public void setLibraryService(LibraryService libraryService) {
        this.libraryService = libraryService;
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
}
