package com.xworkz.bus.events;

public class BusSpeedException extends Exception {
    public BusSpeedException() {
        System.err.println("Bus speed is too high");
    }
}
