 class Hostel {
    public Hostel() {
        System.out.println("There is a hostel");
    }

    public Hostel(int id) {
        id = 501;
        System.out.println("Hostel ID: " + id);
    }

    public Hostel(int id, String name) {
        name = "SDMC";
        System.out.println("Hostel Name: " + name);
    }

    public Hostel(int id, String name, char block) {
        block = 'C';
        System.out.println("Hostel Block: " + block);
    }

    public Hostel(int id, String name, char block, boolean isActive) {
        isActive = true;
        System.out.println("Is Hostel Active: " + isActive);
    }

    public Hostel(int id, String name, char block, boolean isActive, long capacity) {
        capacity = 200L;
        System.out.println("Hostel Capacity: " + capacity);
    }

    public Hostel(int id, String name, char block, boolean isActive, long capacity, double fees) {
        fees = 12000.50;
        System.out.println("Hostel Fees: " + fees);
    }

    public Hostel(int id, String name, char block, boolean isActive, long capacity, double fees, float rating) {
        rating = 4.5f;
        System.out.println("Hostel Rating: " + rating);
    }
}
