package com.xworkz.bank.internal;

public class BranchException extends Exception {

    public String checkBranch(String branch) {
        if(branch.equals("Main")) {
            return "Main branch selected";
        } else {
            return "Branch not found";
        }
    }
}
