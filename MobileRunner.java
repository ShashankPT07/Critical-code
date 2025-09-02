class MobileRunner {
    public static void main(String[] args) {
        new Mobile();
        new Mobile(1);
        new Mobile(1, "OnePlus");
        new Mobile(1, "OnePlus", 'M');
        new Mobile(1, "OnePlus", 'M', false);
        new Mobile(1, "OnePlus", 'M', false, 98765345);
        new Mobile(1, "OnePlus", 'M', false, 98765345, 32999.99);
        new Mobile(1, "OnePlus", 'M', false, 98765345, 32999.99, 4.3f);
    }
}
