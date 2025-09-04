class Product {

    

    public void details() {
        System.out.println("Product details");
    }

    public void availability() {
        System.out.println("Product availability");
        details();
    }

    public void sell() {
        System.out.println("Selling the product");
        availability();
    }

    public void restock() {
        System.out.println("Restocking the product");
        sell();
    }

    public void category() {
        System.out.println("Product category");
        restock();
    }
}
