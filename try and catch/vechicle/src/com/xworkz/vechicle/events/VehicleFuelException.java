package com.xworkz.vechicle.events;



public class VehicleFuelException extends Exception {
    public VehicleFuelException(){
        System.err.println("Invalid fuel type");
    }
}

