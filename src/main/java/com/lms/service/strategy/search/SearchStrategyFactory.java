package com.lms.service.strategy.search;

import java.util.HashMap;
import java.util.Map;

public class SearchStrategyFactory {
    private static final Map<String, SearchStrategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put("title", new TitleSearchStrategy());
        strategyMap.put("author", new AuthorSearchStrategy());
        strategyMap.put("category", new SubjectCategorySearchStrategy());
        strategyMap.put("date", new PublicationDateSearchStrategy());
    }

    public static SearchStrategy getSearchStrategy(String type) {
        return strategyMap.get(type.toLowerCase());
    }
}
