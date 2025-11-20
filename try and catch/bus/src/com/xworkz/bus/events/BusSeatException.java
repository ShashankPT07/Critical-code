package com.xworkz.bus.events;

public class BusSeatException extends Exception {
    public BusSeatException() {
        System.err.println("Invalid seat count");
    }
}
