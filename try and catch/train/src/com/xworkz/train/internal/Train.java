package com.xworkz.train.internal;

import com.xworkz.train.events.*;

public class Train {

    public int checkSpeed(int speed){
        if(speed > 300){
            try {
                throw new TrainSpeedException();
            } catch (TrainSpeedException e){
                e.printStackTrace();
                System.out.println("Train overspeeding");
            }
        } else {
            System.out.println("Train speed normal");
        }
        return speed;
    }

    public int checkCoaches(int coaches){
        if(coaches < 10){
            try {
                throw new TrainCoachException();
            } catch (TrainCoachException e){
                e.printStackTrace();
                System.out.println("Not enough coaches");
            }
        } else {
            System.out.println("Coach count valid");
        }
        return coaches;
    }

    public String checkRoute(String route){
        if(route.equals("Unknown")){
            try {
                throw new TrainRouteException();
            } catch (TrainRouteException e){
                e.printStackTrace();
                System.out.println("Route not recognized");
            }
        } else {
            System.out.println("Route valid");
        }
        return route;
    }

    public String checkType(String type){
        if(type.equals("FlyingTrain")){
            try {
                throw new TrainTypeException();
            } catch (TrainTypeException e){
                e.printStackTrace();
                System.out.println("Invalid train type");
            }
        } else {
            System.out.println("Train type normal");
        }
        return type;
    }

    public int checkPrice(int price){
        if(price > 5000){
            try {
                throw new TrainPriceException();
            } catch (TrainPriceException e){
                e.printStackTrace();
                System.out.println("Ticket too expensive");
            }
        } else {
            System.out.println("Ticket price ok");
        }
        return price;
    }
}
