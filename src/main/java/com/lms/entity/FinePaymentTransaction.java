package com.lms.entity;

import com.lms.constants.PaymentStatus;

import java.util.UUID;

public class FinePaymentTransaction {
    private static int ID_GENERATOR = 0;
    private int id;
    private Fine fine;
    private PaymentStatus paymentStatus;
    private UUID paymentId;

    public FinePaymentTransaction(PaymentStatus paymentStatus, UUID paymentId) {
        this.id = ++ID_GENERATOR;
        this.paymentStatus = paymentStatus;
        this.paymentId = paymentId;
    }

    public int getId() {
        return id;
    }

    public Fine getFine() {
        return fine;
    }

    public void setFine(Fine fine) {
        this.fine = fine;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public UUID getPaymentId() {
        return paymentId;
    }
}
