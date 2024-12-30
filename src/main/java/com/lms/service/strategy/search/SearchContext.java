package com.lms.service.strategy.search;

import com.lms.entity.Book;

import java.util.List;

public class SearchContext {
    private SearchStrategy searchStrategy;

    public SearchContext(String searchType) {
        this.searchStrategy = SearchStrategyFactory.getSearchStrategy(searchType);
    }

    public List<Book> search(List<Book> books, Object criteria) {
        return searchStrategy.search(books, criteria);
    }
}
