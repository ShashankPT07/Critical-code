package com.xworkz.student.internal;

public class InvalidSectionException extends Exception {

    public String validateSection(String section) throws InvalidSectionException {
        String value = "";

        if (section=="C") {
            System.out.println("Section is valid");
        } else {
            System.out.println("Invalid section");
        }

        return value;
    }
}
