class Vehicle {

    public int wheels;

    public void engine() {
        System.out.println("Vehicle has an engine");
    }

    public void fuelType() {
        System.out.println("Type of fuel used");
        engine();
    }

    public void capacity() {
        System.out.println("Seating capacity of the vehicle");
        fuelType();
    }

    public void speed() {
        System.out.println("Maximum speed of the vehicle");
        capacity();
    }

    public void type() {
        System.out.println("Type of the vehicle");
        speed();
    }
}
