 class Shop {
    public Shop() {
        System.out.println("Welcome to the Shop");
    }

    public Shop(int shopId) {
        shopId = 101;
        System.out.println("Shop ID: " + shopId);
    }

    public Shop(int shopId, String shopName) {
        shopName = "SuperMart";
        System.out.println("Shop Name: " + shopName);
    }

    public Shop(int shopId, String shopName, char grade) {
        grade = 'A';
        System.out.println("Shop Grade: " + grade);
    }

    public Shop(int shopId, String shopName, char grade, boolean isOpen) {
        isOpen = true;
        System.out.println("Is Shop Open: " + isOpen);
    }

    public Shop(int shopId, String shopName, char grade, boolean isOpen, long annualRevenue) {
        annualRevenue = 5000000L;
        System.out.println("Annual Revenue: " + annualRevenue);
    }

    public Shop(int shopId, String shopName, char grade, boolean isOpen, long annualRevenue, double totalSales) {
        totalSales = 1250000.75;
        System.out.println("Total Sales: " + totalSales);
    }

    public Shop(int shopId, String shopName, char grade, boolean isOpen, long annualRevenue, double totalSales, float discountRate) {
        discountRate = 7.5f;
        System.out.println("Discount Rate: " + discountRate);
    }
}
