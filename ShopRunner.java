 class ShopRunner {
    public static void main(String[] args) {
        new Shop();
        new Shop(1);
        new Shop(1, "abc");
        new Shop(1, "abc", 'B');
        new Shop(1, "abc", 'B', false);
        new Shop(1, "abc", 'B', false, 9876543210);
        new Shop(1, "abc", 'B', false, 9876543210, 250000.50);
        new Shop(1, "abc", 'B', false, 9876543210, 250000.50, 12.5f);
    }
}
