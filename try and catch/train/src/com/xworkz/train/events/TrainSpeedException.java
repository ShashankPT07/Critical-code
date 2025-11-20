package com.xworkz.train.events;

public class TrainSpeedException extends Exception {
    public TrainSpeedException() {
        System.err.println("Train speed is too high");
    }
}
