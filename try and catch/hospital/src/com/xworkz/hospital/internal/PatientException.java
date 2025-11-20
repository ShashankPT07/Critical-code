package com.xworkz.hospital.internal;

public class PatientException extends Exception {

    public String checkPatient(int id) {
        if(id > 0) {
            return "Patient record found";
        } else {
            return "Patient record not found";
        }
    }
}
