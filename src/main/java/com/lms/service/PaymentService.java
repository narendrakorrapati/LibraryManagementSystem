package com.lms.service;

import com.lms.constants.PaymentStatus;
import com.lms.entity.Account;
import com.lms.entity.Fine;
import com.lms.entity.FineTransaction;

import java.util.UUID;

public class PaymentService {

    public FineTransaction collectFine(Fine fine) {
        double amount = fine.calculateFine();
        Account account = fine.getBookCheckout().getCheckedOutBy();
        //Process payment
        System.out.println("Collecting Amount:" + amount + "From member:" + account.getUsername());
        FineTransaction fineTransaction = new FineTransaction(fine, PaymentStatus.SUCCESS, UUID.randomUUID());
        return fineTransaction;
    }
}
