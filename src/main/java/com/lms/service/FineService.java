package com.lms.service;

import com.lms.entity.BookCheckout;
import com.lms.entity.Fine;
import com.lms.entity.FineTransaction;
import com.lms.service.strategy.finecalculation.RegularFineCalculationStrategy;

public class FineService {
    private PaymentService paymentService;

    public FineService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public FineTransaction processFine(BookCheckout bookCheckout) {
        Fine fine = new Fine (bookCheckout, new RegularFineCalculationStrategy(10));
        //Check if member is premium or regular, set the strategy accordingly
        return paymentService.collectFine(fine);
    }
}