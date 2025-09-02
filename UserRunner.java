 class UserRunner {
    public static void main(String[] args) {
        new User();
        new User(1);
        new User(1, "exampleUser");
        new User(1, "exampleUser", 'A');
        new User(1, "exampleUser", 'A', true);
        new User(1, "exampleUser", 'A', true, 9876543210L);
        new User(1, "exampleUser", 'A', true, 9876543210L, 1500.75);
        new User(1, "exampleUser", 'A', true, 9876543210L, 1500.75, 4.8f);
    }
}
