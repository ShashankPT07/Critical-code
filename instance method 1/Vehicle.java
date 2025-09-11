 class Vehicle {

    private String make = "Toyota";
    private String model = "Corolla";
    private int year = 2022;
    private String fuelType = "Petrol";
    private double mileage = 15000.5;    
    private boolean isElectric = false;

    public String getMake() {
		System.out.println(make);
        return make;
    }

    public String getModel() {
		System.out.println(model);
        return model;
    }

    public int getYear() {
		System.out.println(year);
        return year;
    }

    public String getFuelType() {
		System.out.println(fuelType);
        return fuelType;
    }

    public double getMileage() {
		System.out.println(mileage);
        return mileage;
    }

    public boolean isElectric() {
		System.out.println(isElectric);
        return isElectric;
    }
}
