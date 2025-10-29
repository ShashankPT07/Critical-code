package com.xworkz.vehicle.internal;

public abstract class Vehicle {
    public String brand;
    public String model;
    public int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayVehicleInfo() {
        System.out.println("Vehicle Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("Year = " + year);
        System.out.println("Vehicle Type = " + this.getClass().getSimpleName());
    }
}





