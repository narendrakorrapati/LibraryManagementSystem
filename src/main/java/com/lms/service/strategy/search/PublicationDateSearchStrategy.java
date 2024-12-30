package com.lms.service.strategy.search;

import com.lms.entity.Book;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class PublicationDateSearchStrategy implements SearchStrategy{
    @Override
    public List<Book> search(List<Book> books, Object criteria) {
        LocalDate publicationDate = (LocalDate) criteria;
        return books.stream().filter(book -> book.getPublicationDate().equals(publicationDate)).collect(Collectors.toList());
    }
}
