package com.java.training.codingactivity02;

public class Payment {
    private double amountPaid;
    private String modesOfPayment;
    private int loanType;

    public Payment(double amountPaid, String modesOfPayment, int loanType) {
        this.amountPaid = amountPaid;
        this.modesOfPayment = modesOfPayment;
        this.loanType = loanType;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getModesOfPayment() {
        return modesOfPayment;
    }

    public void setModesOfPayment(String modesOfPayment) {
        this.modesOfPayment = modesOfPayment;
    }

    public int getLoanType() {
        return loanType;
    }

    public void setLoanType(int loanType) {
        this.loanType = loanType;
    }
}
