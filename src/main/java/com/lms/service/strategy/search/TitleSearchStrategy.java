package com.lms.service.strategy.search;

import com.lms.entity.Book;

import java.util.List;
import java.util.stream.Collectors;

public class TitleSearchStrategy implements SearchStrategy{
    @Override
    public List<Book> search(List<Book> books, Object criteria) {
        String title = (String) criteria;
        return books.stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
    }
}
