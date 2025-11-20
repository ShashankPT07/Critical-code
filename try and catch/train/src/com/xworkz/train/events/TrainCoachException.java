package com.xworkz.train.events;

public class TrainCoachException extends Exception {
    public TrainCoachException() {
        System.err.println("Invalid number of coaches");
    }
}
