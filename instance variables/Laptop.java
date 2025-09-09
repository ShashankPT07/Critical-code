class Laptop {
    public int laptopId = 7001;
    public String brand = "Dell";
    public String model = "XPS 13";
    public char processorType = 'I'; 
    public boolean hasTouchScreen = false;
    public float screenSize = 13.3f; 
    public double price = 120000.0;
    public long serialNumber = 9876543210123L;

    public void displayLaptop() {
        System.out.println("Laptop ID: " + laptopId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor Type: " + processorType);
        System.out.println("Touch Screen: " + hasTouchScreen);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Price: ₹" + price);
        System.out.println("Serial Number: " + serialNumber);
    }
}
