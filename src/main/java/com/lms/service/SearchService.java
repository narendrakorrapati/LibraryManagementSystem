package com.lms.service;

import com.lms.entity.Book;
import com.lms.repository.LibraryRepository;
import com.lms.service.strategy.search.SearchContext;

import java.util.List;

public class SearchService {

    private LibraryRepository libraryRepository;

    public SearchService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public List<Book> search(String searchType, Object criteria) {
        SearchContext searchContext = new SearchContext(searchType);
        return searchContext.search(libraryRepository.getLibrary().getBooks(), criteria);
    }
}
