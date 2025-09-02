 class HostelRunner {
    public static void main(String[] args) {
        new Hostel();
        new Hostel(1);
        new Hostel(1, "HGh");
        new Hostel(1, "HGh", 'B');
        new Hostel(1, "HGh", 'B', false);
        new Hostel(1, "HGh", 'B', false, 150);
        new Hostel(1, "HGh", 'B', false, 150, 10000.0);
        new Hostel(1, "HGh", 'B', false, 150, 10000.0, 4.2f);
    }
}
