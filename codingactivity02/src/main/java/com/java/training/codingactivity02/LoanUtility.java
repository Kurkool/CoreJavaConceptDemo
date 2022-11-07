package com.java.training.codingactivity02;

public class LoanUtility{

    public void validateLoan(int monthsOfContribution) throws InvalidLoanException {
        if(monthsOfContribution < 36){
            throw new InvalidLoanException("Months of contribution is less than the required months");
        }
    }
}
