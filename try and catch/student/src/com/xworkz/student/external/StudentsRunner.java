package com.xworkz.student.external;

import com.xworkz.student.internal.*;

public class StudentsRunner {
    public static void main(String[] args) throws Throwable {

        // ----- Your Runner Logic (NumberOfStudents) -----
        NumberOfStudents number = new NumberOfStudents();

        try {
            number.numberOfStudents(90);
        } catch (NumberOfStudents num) {
            num.printStackTrace();
        }
        InvalidMarksException exception = new InvalidMarksException();

        try {
            exception.validateMarks(85);
        } catch (InvalidMarksException e) {
            e.printStackTrace();
        }
        InvalidAttendanceException attendance = new InvalidAttendanceException();
        try {
            attendance.validateAttendance(95);
        } catch (InvalidAttendanceException e) {
            e.printStackTrace();
        }


        InvalidAgeException age = new InvalidAgeException();
        try {
            age.validateAge(20);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }


        InvalidSectionException section = new InvalidSectionException();
        try {
            section.validateSection("B");
        } catch (InvalidSectionException e) {
            e.printStackTrace();
        }
    }
}
