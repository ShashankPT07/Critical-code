package com.xworkz.train.events;

public class TrainTypeException extends Exception {
    public TrainTypeException() {
        System.err.println("Invalid train type");
    }
}
