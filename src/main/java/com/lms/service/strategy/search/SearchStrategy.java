package com.lms.service.strategy.search;

import com.lms.entity.Book;

import java.util.List;

public interface SearchStrategy {
    List<Book> search(List<Book> books, Object criteria);
}
