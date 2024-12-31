package com.lms;

import com.lms.constants.BookStatus;
import com.lms.constants.SubjectCategory;
import com.lms.entity.*;
import com.lms.repository.LibraryRepository;
import com.lms.service.FineService;
import com.lms.service.LibraryService;
import com.lms.service.PaymentService;
import com.lms.service.SearchService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibrarySystemSimulator {
    public static void main(String[] args) {
        Address libraryAddress = new Address("622006", "LibraryCity", "LibraryState");

        Library library = new Library("State Library", libraryAddress);
        LibraryRepository libraryRepository = new LibraryRepository(library);
        PaymentService paymentService = new PaymentService();
        FineService fineService = new FineService(paymentService);
        SearchService searchService = new SearchService(libraryRepository);
        LibraryService libraryService = new LibraryService(libraryRepository, fineService);
        List<Book> books = getBooks();
        List<Account> users = getUsers(libraryService, searchService);
        library.setBooks(books);
        library.setUsers(users);

        List<Book> searchByTitle = users.get(0).search("title", "Clean Code");
        System.out.println(searchByTitle);

        Member member = (Member) users.get(2);
        BookReservation bookReservation = member.reserveBook(searchByTitle.get(0).getBookItems().get(0));
        System.out.println(bookReservation);
    }
    private static List<Account> getUsers(LibraryService libraryService, SearchService searchService) {

        List<Account> users = new ArrayList<>();
        users.addAll(generateAdmins(libraryService, searchService));
        users.addAll(generateMembers(libraryService, searchService));
        return users;
    }

    public static List<Account> generateAdmins(LibraryService libraryService, SearchService searchService) {
        Address adminAddress1 = new Address("12345", "CityA", "StateA");
        Address adminAddress2 = new Address("456789", "CityB", "StateB");

        Account admin1 = new Admin("admin1", "password1", adminAddress1, "admin1@example.com", libraryService, searchService);
        Account admin2 = new Admin("admin2", "password2", adminAddress2, "admin2@example.com", libraryService, searchService);

        return List.of(admin1, admin2);
    }

    public static List<Account> generateMembers(LibraryService libraryService, SearchService searchService) {
        Address memberAddress1 = new Address("12345", "CityA", "StateA");
        Address adminAddress2 = new Address("456789", "CityB", "StateB");

        Account member1 = new Member("member1", "password1", memberAddress1, "member1@example.com", libraryService, searchService);
        Account member2 = new Member("member2", "password2", adminAddress2, "member2@example.com", libraryService, searchService);

        return List.of(member1, member2);
    }

    private static List<Book> getBooks() {
        // Authors
        Author author1 = new Author("Robert C. Martin", new ArrayList<>());
        Author author2 = new Author("Paulo Coelho", new ArrayList<>());
        Author author3 = new Author("George Orwell", new ArrayList<>());

        // Books
        Book book1 = new Book(
                "Clean Code",
                Arrays.asList(author1),
                SubjectCategory.CSE,
                LocalDate.of(2008, 8, 1)
        );

        Book book2 = new Book(
                "The Alchemist",
                Arrays.asList(author2),
                SubjectCategory.ECE,
                LocalDate.of(1988, 1, 1)
        );

        Book book3 = new Book(
                "1984",
                Arrays.asList(author3),
                SubjectCategory.EEE,
                LocalDate.of(1949, 6, 8)
        );

        // Link books to authors
        author1.getBooks().add(book1);
        author2.getBooks().add(book2);
        author3.getBooks().add(book3);

        // BookItems
        BookItem bookItem1 = new BookItem(BookStatus.AVAILABLE, book1);
        BookItem bookItem2 = new BookItem(BookStatus.CHECKED_OUT, book1);
        BookItem bookItem3 = new BookItem(BookStatus.AVAILABLE, book2);
        BookItem bookItem4 = new BookItem(BookStatus.LOST, book3);

        book1.getBookItems().addAll(Arrays.asList(bookItem1, bookItem2));
        book2.getBookItems().add(bookItem3);
        book3.getBookItems().add(bookItem4);

        return Arrays.asList(book1, book2, book3);

    }
}