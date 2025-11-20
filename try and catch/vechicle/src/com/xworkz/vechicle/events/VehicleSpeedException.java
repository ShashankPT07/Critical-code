package com.xworkz.vechicle.events;



public class VehicleSpeedException extends Exception {
    public VehicleSpeedException(){
        System.err.println("Speed limit exceeded");
    }
}

