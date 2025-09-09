
class Chair {
    public int legs = 4;
    public String material = "Wood";
    public char type = 'O'; 
    public boolean hasCushion = true;
    public float height = 1.2f; 
    public double price = 3500.75;
    public long productId = 223344556677L;

    public void displayChair() {
        System.out.println("Legs: " + legs);
        System.out.println("Material: " + material);
        System.out.println("Type: " + type);
        System.out.println("Has Cushion: " + hasCushion);
        System.out.println("Height: " + height + " m");
        System.out.println("Price: " + price);
        System.out.println("Product ID: " + productId);
    }
}
