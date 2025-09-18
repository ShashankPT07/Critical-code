class HouseRunner {
    public static void main(String[] args) {
        Address address = new Address("123 Main St, New ");
        House house = new House(address);
        house.displayHouse();
    }
}