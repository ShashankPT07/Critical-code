 class Television {
    public Television() {
        System.out.println("There is a television");
    }
    public Television(int id) {
        id = 301;
        System.out.println("Television ID: " + id);
    }
    public Television(int id, String brand) {
        brand = "Sony";
        System.out.println("Brand: " + brand);
    }
    public Television(int id, String brand, char sizeCategory) {
        sizeCategory = 'L';
        System.out.println("Size Category: " + sizeCategory);
    }
    public Television(int id, String brand, char sizeCategory, boolean isSmart) {
        isSmart = true;
        System.out.println("Is Smart TV: " + isSmart);
    }
    public Television(int id, String brand, char sizeCategory, boolean isSmart, long serialNumber) {
        serialNumber = 1234567890L;
        System.out.println("Serial Number: " + serialNumber);
    }
    public Television(int id, String brand, char sizeCategory, boolean isSmart, long serialNumber, double price) {
        price = 65999.99;
        System.out.println("Price: ₹" + price);
    }
    public Television(int id, String brand, char sizeCategory, boolean isSmart, long serialNumber, double price, float screenSize) {
        screenSize = 55.5f;
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}
