 class AnimalsRunner {
    public static void main(String[] args) {
        new Animals();
        new Animals(1);
        new Animals(1, "Elephant");
        new Animals(1, "Elephant", 'M');
        new Animals(1, "Elephant", 'M', true);
        new Animals(1, "Elephant", 'M', true, 10000);
        new Animals(1, "Elephant", 'M', true, 10000, 5400.0);
        new Animals(1, "Elephant", 'M', true, 10000, 5400.0, 25.5f);
    }
}
