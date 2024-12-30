package com.lms.entity;

import com.lms.service.strategy.finecalculation.FineCalculationStrategy;

public class Fine {
    private FineCalculationStrategy fineCalculationStrategy;
    private static int ID_GENERATOR = 0;
    private int id;
    private BookCheckout bookCheckout;

    public Fine(BookCheckout bookCheckout, FineCalculationStrategy fineCalculationStrategy) {
        this.id = ++ID_GENERATOR;
        this.bookCheckout = bookCheckout;
        this.fineCalculationStrategy = fineCalculationStrategy;
    }

    public int getId() {
        return id;
    }

    public FineCalculationStrategy getFineCalculationStrategy() {
        return fineCalculationStrategy;
    }

    public void setFineCalculationStrategy(FineCalculationStrategy fineCalculationStrategy) {
        this.fineCalculationStrategy = fineCalculationStrategy;
    }

    public double calculateFine() {
        return fineCalculationStrategy.calculateFee(bookCheckout.getOverdueBy());
    }
    public BookCheckout getBookCheckout() {
        return bookCheckout;
    }

    public void setBookCheckout(BookCheckout bookCheckout) {
        this.bookCheckout = bookCheckout;
    }
}
