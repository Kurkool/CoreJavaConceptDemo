package com.java.training.codingactivity02;

import java.util.ArrayList;
import java.util.List;

public abstract class Loan {
    private Customer customer;
    private List<Payment> payments = new ArrayList<Payment>();

    public Loan(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public void addPayment(Payment payment) {
        this.getPayments().add(payment);
    }

    public double getTotalPayment(){
        double TotalPayment = 0;
        for(Payment eachPayment : getPayments()) {
            TotalPayment += eachPayment.getAmountPaid();
        }
        return TotalPayment;
    }

    public abstract double getInterestRate();

    public double getTotalInterest(){
        return this.getCustomer().getAmountLoan() * this.getInterestRate();
    }

    public double getMonthlyAmortization(){
        double monthlyWithoutInterest = this.getCustomer().getAmountLoan() / this.getCustomer().getTerms();
        double monthlyInterest = monthlyWithoutInterest * getInterestRate();

        return monthlyWithoutInterest + monthlyInterest;
    }

    public double getOutstandingBalance(){
        return  (this.getCustomer().getAmountLoan() + this.getTotalInterest()) - this.getTotalPayment();
    }

    public void printstatement(){
        System.out.println("Interest Rate: \t\t" + this.getInterestRate());
        System.out.format("Monthly Amortization: \t%.2f\n",this.getMonthlyAmortization());
        System.out.println("--------------------");
        System.out.println("Mode of Payment\t\tAmount");
        this.getPayments().forEach(p -> System.out.format(p.getModesOfPayment() + "\t\t\t%.2f\n",p.getAmountPaid()));
        System.out.format("Total Payment: \t\t%.2f\n",this.getTotalPayment());
        System.out.format("Outstanding Balance: \t%.2f\n",this.getOutstandingBalance());
    }
}
