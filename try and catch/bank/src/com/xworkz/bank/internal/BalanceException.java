package com.xworkz.bank.internal;

public class BalanceException extends Exception {

    public String checkBalance(int balance) {
        if(balance >= 1000) {
            return "Sufficient balance";
        } else {
            return "Low balance";
        }
    }
}
