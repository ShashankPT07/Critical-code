package com.xworkz.vehicle.external;

import com.xworkz.vehicle.internal.Car;
import com.xworkz.vehicle.internal.Vehicle;

public class ShowroomRunner {
    public static void main(String[] args) {

        Vehicle car1 = new Car("Toyota", "Camry", 2022);
        Vehicle car2 = new Car("Tesla", "Model S", 2023);
        Vehicle car3 = new Car("Honda", "Civic", 2021);

        car1.displayVehicleInfo();

        car2.displayVehicleInfo();

        car3.displayVehicleInfo();
    }
}
