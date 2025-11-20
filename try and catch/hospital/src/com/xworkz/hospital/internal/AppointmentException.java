package com.xworkz.hospital.internal;

public class AppointmentException extends Exception {

    public String checkAppointment(String day) {
        if(day.equals("Monday")) {
            return "Appointment confirmed";
        } else {
            return "No appointments available";
        }
    }
}
