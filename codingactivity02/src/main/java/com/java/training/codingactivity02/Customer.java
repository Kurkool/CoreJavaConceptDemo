package com.java.training.codingactivity02;

public class Customer {
    private String firstName;
    private String lastName;
    private double amountLoan;
    private int terms;
    private int monthsOfContribution;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAmountLoan() {
        return amountLoan;
    }

    public void setAmountLoan(double amountLoan) {
        this.amountLoan = amountLoan;
    }

    public int getTerms() {
        return terms;
    }

    public void setTerms(int terms) {
        this.terms = terms;
    }

    public int getMonthsOfContribution() {
        return monthsOfContribution;
    }

    public void setMonthsOfContribution(int monthsOfContribution) {
        this.monthsOfContribution = monthsOfContribution;
    }

    public void displayDetails() {
        System.out.println("Customer Name:"+this.getFirstName() + " " + this.getLastName());
        System.out.println("Loan Amount:"+this.getAmountLoan());
        System.out.println("Loan Terms:"+this.getTerms());
        System.out.println("Months of Contribution:"+this.getMonthsOfContribution());
    }
}
