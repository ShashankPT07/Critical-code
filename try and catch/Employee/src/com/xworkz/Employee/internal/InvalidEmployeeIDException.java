package com.xworkz.Employee.internal;



public class InvalidEmployeeIDException extends Exception {

    public int validateID(int id) throws InvalidEmployeeIDException {
        int value = 0;

        if (id > 0) {
            System.out.println("Employee ID is valid");
        } else {
            System.out.println("Invalid Employee ID");
        }

        return value;
    }
}

