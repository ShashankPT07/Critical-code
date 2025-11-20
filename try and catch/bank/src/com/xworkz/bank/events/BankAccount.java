package com.xworkz.bank.events;

import com.xworkz.bank.internal.AccountException;

public class BankAccount {
    public String accountInfo() throws AccountException {
        throw new AccountException();
    }
}
