package com.xworkz.student.internal;

public class InvalidMarksException extends Exception {

    public int validateMarks(int marks) throws InvalidMarksException {
        int result = 0;

        if ( marks <100) {
            System.out.println("Marks are valid");
        } else {
            System.out.println("Invalid marks");
        }

        return result;
    }
}
