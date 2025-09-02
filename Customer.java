class Customer{


   
    public Customer() {
        System.out.println("There is a customer");
    }

    public Customer(int id) {
        id = 2;
        System.out.println("Customer ID: " +id);
    }

    public Customer(int id, String name) {
        
        name = "shashank";
        System.out.println("Name of the Customer - " + name);
    }

    public Customer(int id, String name, char category) {
       
        category ='A';
        System.out.println("Customer Category - " + category);
    }

    public Customer(int id, String name, char category, boolean isActive) {
        isActive = true;
        System.out.println("Is Customer Active - " +isActive);
    }

    public Customer(int id, String name, char category, boolean isActive, long loyaltyNumber) {
       loyaltyNumber = 65757357L;
        System.out.println("Loyalty Number: " + loyaltyNumber);
    }

    public Customer(int id, String name, char category, boolean isActive, long loyaltyNumber, double accountBalance) {
        accountBalance = 500.75;
        System.out.println("Account Balance - " +accountBalance);
    }

    public Customer(int id, String name, char category, boolean isActive, long loyaltyNumber, double accountBalance, float discountRate) {
        discountRate = 7.5f;
        System.out.println("Discount Rate - " + discountRate);
    }
}
