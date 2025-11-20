package com.xworkz.train.events;

public class TrainRouteException extends Exception {
    public TrainRouteException() {
        System.err.println("Invalid train route");
    }
}
