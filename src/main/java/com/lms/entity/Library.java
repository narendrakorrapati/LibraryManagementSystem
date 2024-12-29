package com.lms.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static int ID_GENERATOR = 0;
    private int id;
    private Address address;
    private List<Book> books;
    private List<Account> users;

    public Library(Address address) {
        this.id = ++ID_GENERATOR;
        this.address = address;
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addUser(Account account) {
        users.add(account);
    }

    public void removeUser(Account account) {
        users.remove(account);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Account> getUsers() {
        return users;
    }

    public void setUsers(List<Account> users) {
        this.users = users;
    }
}
