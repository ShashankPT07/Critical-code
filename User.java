class User{

    public User() {
        System.out.println("User created");
    }

    public User(int id) {
        id = 101;
        System.out.println("User ID: " + id);
    }

    public User(int id, String username) {
        username = "kiccha";
        System.out.println("Username: " + username);
    }

    public User(int id, String username, char role) {
        role = 'A';
        System.out.println("User Role: " + role);
    }

    public User(int id, String username, char role, boolean isActive) {
        isActive = true;
        System.out.println("Is Active: " + isActive);
    }

    public User(int id, String username, char role, boolean isActive, long phoneNumber) {
        phoneNumber = 9876543210L;
        System.out.println("Phone Number: " + phoneNumber);
    }

    public User(int id, String username, char role, boolean isActive, long phoneNumber, double accountBalance) {
        accountBalance = 1500.75;
        System.out.println("Account Balance: " + accountBalance);
    }

    public User(int id, String username, char role, boolean isActive, long phoneNumber, double accountBalance, float rating) {
        rating = 4.8f;
        System.out.println("User Rating: " + rating);
    }
}
