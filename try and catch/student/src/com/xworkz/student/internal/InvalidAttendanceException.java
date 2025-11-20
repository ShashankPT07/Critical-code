package com.xworkz.student.internal;

public class InvalidAttendanceException extends Exception {

    public int validateAttendance(int attendance) throws InvalidAttendanceException {
        int value = 0;

        if (  attendance <= 100) {
            System.out.println("Attendance is valid");
        } else {
            System.out.println("Invalid attendance percentage");
        }

        return value;
    }
}
