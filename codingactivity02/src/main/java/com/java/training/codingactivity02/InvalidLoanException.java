package com.java.training.codingactivity02;

public class InvalidLoanException extends Exception{
    private long serialVersionUID = 1L;
    public InvalidLoanException(String message) {
        super(message);
    }
}
