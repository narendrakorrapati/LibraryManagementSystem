package com.lms.entity;

import com.lms.constants.PaymentStatus;

public class FineTransaction {
    private static int ID_GENERATOR = 0;
    private int id;
    private Fine fine;
    private PaymentStatus paymentStatus;
    private String paymentId;

    public FineTransaction(Fine fine, PaymentStatus paymentStatus, String paymentId) {
        this.id = ++ID_GENERATOR;
        this.fine = fine;
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

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}
