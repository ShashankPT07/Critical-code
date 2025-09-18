class House {
    public String houseLocation;
    public Address address;

    public House(Address address) {
        this.houseLocation = address.location;
        this.address = address;
    }

    public void displayHouse() {
        address.addressDetails();
    }
}