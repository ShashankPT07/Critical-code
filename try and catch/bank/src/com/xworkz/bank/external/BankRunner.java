package com.xworkz.bank.external;

import com.xworkz.bank.events.BankAccount;
import com.xworkz.bank.events.BankBalance;
import com.xworkz.bank.events.BankLoan;
import com.xworkz.bank.events.BankBranch;
import com.xworkz.bank.events.BankTransaction;

import com.xworkz.bank.internal.AccountException;
import com.xworkz.bank.internal.BalanceException;
import com.xworkz.bank.internal.LoanException;
import com.xworkz.bank.internal.BranchException;
import com.xworkz.bank.internal.TransactionException;

public class BankRunner {
    public static void main(String[] args) {


        BankAccount account = new BankAccount();
        BankBalance balance = new BankBalance();
        BankLoan loan = new BankLoan();
        BankBranch branch = new BankBranch();
        BankTransaction transaction = new BankTransaction();


        AccountException acc = new AccountException();
        BalanceException bal = new BalanceException();
        LoanException ln = new LoanException();
        BranchException br = new BranchException();
        TransactionException tr = new TransactionException();


        try {
            account.accountInfo();
        } catch (AccountException e) {
            System.out.println(acc.checkAccount(0));
        }


        try {
            balance.balanceInfo();
        } catch (BalanceException e) {
            System.out.println(bal.checkBalance(800));
        }


        try {
            loan.loanInfo();
        } catch (LoanException e) {
            System.out.println(ln.checkLoan(800000));
        }


        try {
            branch.branchInfo();
        } catch (BranchException e) {
            System.out.println(br.checkBranch("City"));
        }


        try {
            transaction.transactionInfo();
        } catch (TransactionException e) {
            System.out.println(tr.checkTransaction(15000));
        }
    }
}
