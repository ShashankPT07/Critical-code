package com.xworkz.bus.events;

public class BusTypeException extends Exception {
    public BusTypeException() {
        System.err.println("Invalid bus type");
    }
}
