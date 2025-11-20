package com.xworkz.bus.events;

public class BusPriceException extends Exception {
    public BusPriceException() {
        System.err.println("Bus price too high");
    }
}
