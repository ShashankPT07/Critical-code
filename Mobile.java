 class Mobile {
    public Mobile() {
        System.out.println("There is a mobile");
    }
    public Mobile(int id) {
        id = 201;
        System.out.println("Mobile ID: " + id);
    }
    public Mobile(int id, String brand) {
        brand = "Samsung";
        System.out.println("Brand: " + brand);
    }
    public Mobile(int id, String brand, char sizeCategory) {
        sizeCategory = 'L';
        System.out.println("Size Category: " + sizeCategory);
    }
    public Mobile(int id, String brand, char sizeCategory, boolean is5G) {
        is5G = true;
        System.out.println("Supports 5G: " + is5G);
    }
    public Mobile(int id, String brand, char sizeCategory, boolean is5G, long imei) {
        imei = 123456789012345L;
        System.out.println("IMEI: " + imei);
    }
    public Mobile(int id, String brand, char sizeCategory, boolean is5G, long imei, double price) {
        price = 49999.99;
        System.out.println("Price: ₹" + price);
    }
    public Mobile(int id, String brand, char sizeCategory, boolean is5G, long imei, double price, float rating) {
        rating = 4.6f;
        System.out.println("Rating: " + rating);
    }
}
