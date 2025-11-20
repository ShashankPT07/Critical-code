package com.xworkz.train.external;

import com.xworkz.train.internal.Train;

public class TrainRunner {
    public static void main(String[] args) {

        Train train = new Train();

        train.checkSpeed(350);
        train.checkCoaches(5);
        train.checkRoute("Unknown");
        train.checkType("FlyingTrain");
        train.checkPrice(7000);
    }
}
