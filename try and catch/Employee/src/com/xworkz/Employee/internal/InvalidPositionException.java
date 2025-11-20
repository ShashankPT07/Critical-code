package com.xworkz.Employee.internal;



public class InvalidPositionException extends Exception {

    public String validatePosition(String position) throws InvalidPositionException {
        String value = "";

        if (position.equals("Manager") || position.equals("Developer") || position.equals("Analyst")) {
            System.out.println("Position is valid");
        } else {
            System.out.println("Invalid position");
        }

        return value;
    }
}

