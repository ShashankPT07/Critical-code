package com.xworkz.bus.internal;

import com.xworkz.bus.events.*;

public class Bus {

    public int checkSpeed(int speed){
        if(speed > 100){
            try {
                throw new BusSpeedException();
            } catch (BusSpeedException e){
                e.printStackTrace();
                System.out.println("Bus overspeeding");
            }
        } else {
            System.out.println("Bus speed normal");
        }
        return speed;
    }

    public int checkSeats(int seats){
        if(seats < 20){
            try {
                throw new BusSeatException();
            } catch (BusSeatException e){
                e.printStackTrace();
                System.out.println("Seat count too low");
            }
        } else {
            System.out.println("Seat count ok");
        }
        return seats;
    }

    public String checkRoute(String route){
        if(route.equals("Unknown")){
            try {
                throw new BusRouteException();
            } catch (BusRouteException e){
                e.printStackTrace();
                System.out.println("Route not available");
            }
        } else {
            System.out.println("Route valid");
        }
        return route;
    }

    public String checkType(String type){
        if(type.equals("FlyingBus")){
            try {
                throw new BusTypeException();
            } catch (BusTypeException e){
                e.printStackTrace();
                System.out.println("Invalid bus type");
            }
        } else {
            System.out.println("Bus type normal");
        }
        return type;
    }

    public int checkPrice(int price){
        if(price > 10000000){
            try {
                throw new BusPriceException();
            } catch (BusPriceException e){
                e.printStackTrace();
                System.out.println("Bus too costly");
            }
        } else {
            System.out.println("Price acceptable");
        }
        return price;
    }
}
