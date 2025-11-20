package com.xworkz.Employee.internal;



public class InvalidExperienceException extends Exception {

    public int validateExperience(int experience) throws InvalidExperienceException {
        int value = 0;

        if (experience >= 0 && experience <= 40) {
            System.out.println("Experience is valid");
        } else {
            System.out.println("Invalid experience");
        }

        return value;
    }
}

