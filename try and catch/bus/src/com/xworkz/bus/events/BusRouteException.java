package com.xworkz.bus.events;

public class BusRouteException extends Exception {
    public BusRouteException() {
        System.err.println("Invalid bus route");
    }
}
