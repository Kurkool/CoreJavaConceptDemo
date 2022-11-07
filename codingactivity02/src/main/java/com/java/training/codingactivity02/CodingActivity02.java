package com.java.training.codingactivity02;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CodingActivity02 {
    public static void main(String[] args) throws InvalidLoanException {
//        Customer customer = new Customer();
//        customer.setFirstName("Jane");
//        customer.setLastName("Doe");
//        customer.setAmountLoan(30000.0);
//        customer.setTerms(36);
//        customer.setMonthsOfContribution(40);
//        customer.displayDetails();
//        LoanUtility loanUtility = new LoanUtility();
//        loanUtility.validateLoan(customer.getMonthsOfContribution());
//        System.out.println("");
//
//        System.out.println(">> SALARY LOAN <<");
//        Loan salaryLoan = new SalaryLoan(customer);
//        salaryLoan.addPayment(new Payment(916.67,"Cash",1));
//        salaryLoan.addPayment(new Payment(920.00,"Bank",1));
//        salaryLoan.addPayment(new Payment(930.00,"Check",1));
//        salaryLoan.printstatement();
//        System.out.println("");
//
//        System.out.println(">> CALAMITY LOAN <<");
//        Loan calamityLoan = new CalamityLoan(customer);
//        calamityLoan.addPayment(new Payment(875.00,"Cash",2));
//        calamityLoan.addPayment(new Payment(875.00,"Bank",2));
//        calamityLoan.addPayment(new Payment(880.00,"Check",2));
//        calamityLoan.printstatement();
//        System.out.println("====================");
//
//        Customer customer2 = new Customer();
//        customer2.setFirstName("Stacey");
//        customer2.setLastName("Doe");
//        customer2.setAmountLoan(15000.0);
//        customer2.setTerms(24);
//        customer2.setMonthsOfContribution(12);
//        customer2.displayDetails();
//        loanUtility.validateLoan(customer2.getMonthsOfContribution());



        String DATE_FORMAT = "yyyy-MM-dd";

        ZonedDateTime date1 = ZonedDateTime.parse("1977-01-01T07:00:00+07:00");
        System.out.println(date1);


        String date2 = DateTimeFormatter.ofPattern(DATE_FORMAT).format(date1);
        System.out.println(date2);
    }
}
