package com.lms.service.strategy.search;

import com.lms.entity.Author;
import com.lms.entity.Book;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorSearchStrategy implements SearchStrategy{
    @Override
    public List<Book> search(List<Book> books, Object criteria) {
        Author author = (Author) criteria;
        return books.stream().filter(book -> book.getAuthors().contains(author)).collect(Collectors.toList());
    }
}
