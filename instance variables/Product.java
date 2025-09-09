class Product {
    public int productId = 1001;
    public String name = "Wireless Mouse";
    public char category = 'E'; 
    public boolean inStock = true;
    public float weight = 0.2f; 
    public double price = 799.99;
    public long barcode = 123456789012L;

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("In Stock: " + inStock);
        System.out.println("Weight: " + weight );
        System.out.println("Price: ₹" + price);
        System.out.println("Barcode: " + barcode);
    }
}
