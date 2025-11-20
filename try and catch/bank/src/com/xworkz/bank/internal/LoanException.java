package com.xworkz.bank.internal;

public class LoanException extends Exception {

    public String checkLoan(int amount) {
        if(amount <= 500000) {
            return "Loan approved";
        } else {
            return "Loan limit exceeded";
        }
    }
}
