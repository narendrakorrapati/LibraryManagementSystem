package com.lms.service;

import com.lms.constants.PaymentStatus;
import com.lms.entity.Account;
import com.lms.entity.FinePaymentTransaction;

import java.util.UUID;

public class PaymentService {

    public FinePaymentTransaction processPayment(double amount, Account account) {
        //Process payment
        System.out.println("Collecting Amount:" + amount + "From member:" + account.getUsername());
        FinePaymentTransaction finePaymentTransaction = new FinePaymentTransaction(PaymentStatus.SUCCESS, UUID.randomUUID());
        return finePaymentTransaction;
    }
}
