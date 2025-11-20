package com.xworkz.vechicle.events;

public class VehiclePriceException extends Exception {
    public VehiclePriceException(){
        System.err.println("Vehicle price too high");
    }
}
