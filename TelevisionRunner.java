class TelevisionRunner {
    public static void main(String[] args) {
        new Television();
        new Television(1);
        new Television(1, "LG");
        new Television(1, "LG", 'M');
        new Television(1, "LG", 'M', false);
        new Television(1, "LG", 'M', false, 987654);
        new Television(1, "LG", 'M', false, 987654, 39999.99);
        new Television(1, "LG", 'M', false, 987654, 39999.99, 43.0f);
    }
}
