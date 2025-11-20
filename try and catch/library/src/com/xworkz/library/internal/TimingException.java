package com.xworkz.library.internal;

public class TimingException extends Exception {
    public String checkTime(int time) {
        if (time < 9) {
            return "Library is closed";
        } else {
            return "Library is open";
        }
    }
}
