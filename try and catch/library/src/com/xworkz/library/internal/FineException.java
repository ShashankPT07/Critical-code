package com.xworkz.library.internal;

public class FineException extends Exception {

    public String checkFine(int amount) {
        if (amount > 0) {
            return "Fine needs to be paid";
        } else {
            return "No fine";
        }
    }
}
