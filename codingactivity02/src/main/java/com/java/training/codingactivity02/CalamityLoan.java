package com.java.training.codingactivity02;

public class CalamityLoan extends Loan{
    public CalamityLoan(Customer customer) {
        super(customer);
    }

    @Override
    public double getInterestRate() {
        return 0.05;
    }

}
