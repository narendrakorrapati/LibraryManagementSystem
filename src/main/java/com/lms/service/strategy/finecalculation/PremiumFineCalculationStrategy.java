package com.lms.service.strategy.finecalculation;

public class PremiumFineCalculationStrategy implements FineCalculationStrategy{

    private double feePerDay;

    public PremiumFineCalculationStrategy(double feePerDay) {
        this.feePerDay = feePerDay;
    }

    public double getFeePerDay() {
        return feePerDay;
    }

    public void setFeePerDay(double feePerDay) {
        this.feePerDay = feePerDay;
    }

    @Override
    public double calculateFee(int overDueBy) {
        double totalFee = (overDueBy * feePerDay);
        //Discount for premium members
        return totalFee - totalFee/10;
    }
}
