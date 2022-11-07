package com.java.training.codingactivity02;

public class SalaryLoan extends Loan{
    public SalaryLoan(Customer customer) {
        super(customer);
    }

    @Override
    public double getInterestRate() {
        return 0.1;
    }

}
