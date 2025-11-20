package com.xworkz.student.internal;

public class InvalidAgeException extends Exception {

    public int validateAge(int age) throws InvalidAgeException {
        int value = 0;

        if ( age <= 25) {
            System.out.println("Age is valid");
        } else {
            System.out.println("Invalid age for student");
        }

        return value;
    }
}
