package com.xworkz.train.events;

public class TrainPriceException extends Exception {
    public TrainPriceException() {
        System.err.println("Train ticket price too high");
    }
}
