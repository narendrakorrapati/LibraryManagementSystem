package com.lms.service.strategy.search;

import com.lms.constants.SubjectCategory;
import com.lms.entity.Book;

import java.util.List;
import java.util.stream.Collectors;

public class SubjectCategorySearchStrategy implements SearchStrategy{
    @Override
    public List<Book> search(List<Book> books, Object criteria) {
        SubjectCategory subjectCategory = (SubjectCategory) criteria;
        return books.stream().filter(book -> book.getSubjectCategory().equals(subjectCategory)).collect(Collectors.toList());
    }
}
