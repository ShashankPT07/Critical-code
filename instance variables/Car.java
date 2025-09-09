class Car {
    public int carId = 5001;
    public String brand = "Toyota";
    public String model = "Corolla";
    public char fuelType = 'P'; 
    public boolean isAutomatic = true;
    public float engineCapacity = 1.8f;
    public double price = 1500000.0;
    public long registrationNumber = 1234567890L;

    public void displayCar() {
        System.out.println("Car ID: " + carId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Automatic: " + isAutomatic);
        System.out.println("Engine Capacity: " + engineCapacity + " L");
        System.out.println("Price: ₹" + price);
        System.out.println("Registration Number: " + registrationNumber);
    }
}
