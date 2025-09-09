class Customer {
    public int customerId = 101;
    public String name = "John Doe";
    public char gender = 'M'; 
    public boolean isMember = true;
    public float height = 1.75f;
    public double walletBalance = 5000.50;
    public long phoneNumber = 9876543210L;

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Membership: " + isMember);
        System.out.println("Height: " + height + " m");
        System.out.println("Wallet Balance: ₹" + walletBalance);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
