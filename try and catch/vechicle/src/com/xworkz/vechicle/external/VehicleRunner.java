package com.xworkz.vechicle.external;



import com.xworkz.vechicle.internal.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        vehicle.checkSpeed(150);
        vehicle.checkFuel("Water");
        vehicle.checkBrand("Unknown");
        vehicle.checkColor("Invisible");
        vehicle.checkPrice(2500000);
    }
}

