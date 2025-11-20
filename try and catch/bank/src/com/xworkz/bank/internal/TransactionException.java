package com.xworkz.bank.internal;

public class TransactionException extends Exception {

    public String checkTransaction(int amount) {
        if(amount <= 10000) {
            return "Transaction successful";
        } else {
            return "Transaction limit exceeded";
        }
    }
}
