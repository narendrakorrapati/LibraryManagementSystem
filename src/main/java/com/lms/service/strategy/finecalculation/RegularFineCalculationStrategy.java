package com.lms.service.strategy.finecalculation;

public class RegularFineCalculationStrategy implements FineCalculationStrategy{
    private int feePerDay;

    public RegularFineCalculationStrategy(int feePerDay) {
        this.feePerDay = feePerDay;
    }

    public int getFeePerDay() {
        return feePerDay;
    }

    public void setFeePerDay(int feePerDay) {
        this.feePerDay = feePerDay;
    }

    @Override
    public double calculateFee(int overDueBy) {
        return overDueBy * feePerDay;
    }
}
