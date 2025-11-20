package com.xworkz.bank.internal;

public class AccountException extends Exception {

    public String checkAccount(int accountNo) {
        if(accountNo > 0) {
            return "Account number is valid";
        } else {
            return "Account number is not valid";
        }
    }
}
