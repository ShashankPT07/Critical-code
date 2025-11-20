package com.xworkz.hospital.internal;

public class DoctorException extends Exception {

    public String checkDoctor(String name) {
        if(name.equals("Ravi")) {
            return "Doctor available";
        } else {
            return "Doctor not available";
        }
    }
}
