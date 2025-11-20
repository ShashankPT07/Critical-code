package com.xworkz.hospital.internal;

public class MedicineException extends Exception {

    public String checkMedicine(int stock) {
        if(stock > 0) {
            return "Medicine in stock";
        } else {
            return "Medicine out of stock";
        }
    }
}
