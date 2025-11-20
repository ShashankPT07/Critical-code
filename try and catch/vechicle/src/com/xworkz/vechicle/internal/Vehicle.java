package com.xworkz.vechicle.internal;

import com.xworkz.vechicle.events.*;

public class Vehicle {

    public int checkSpeed(int speed){
        if(speed > 120){
            try {
                throw new VehicleSpeedException();
            } catch (VehicleSpeedException e){
                e.printStackTrace();
                System.out.println("Vehicle is overspeeding");
            }
        } else {
            System.out.println("Speed is normal");
        }
        return speed;
    }

    public String checkFuel(String fuel){
        if(fuel.equals("Water")){
            try {
                throw new VehicleFuelException();
            } catch (VehicleFuelException e){
                e.printStackTrace();
                System.out.println("Vehicle cannot run on water");
            }
        } else {
            System.out.println("Fuel type ok");
        }
        return fuel;
    }

    public String checkBrand(String brand){
        if(brand.equals("Unknown")){
            try {
                throw new VehicleBrandException();
            } catch (VehicleBrandException e){
                e.printStackTrace();
                System.out.println("Brand not recognized");
            }
        } else {
            System.out.println("Brand is good");
        }
        return brand;
    }

    public String checkColor(String color){
        if(color.equals("Invisible")){
            try {
                throw new VehicleColorException();
            } catch (VehicleColorException e){
                e.printStackTrace();
                System.out.println("Invalid color");
            }
        } else {
            System.out.println("Color accepted");
        }
        return color;
    }

    public int checkPrice(int price){
        if(price > 2000000){
            try {
                throw new VehiclePriceException();
            } catch (VehiclePriceException e){
                e.printStackTrace();
                System.out.println("Vehicle too costly");
            }
        } else {
            System.out.println("Price normal");
        }
        return price;
    }
}

