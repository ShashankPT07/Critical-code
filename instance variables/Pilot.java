class Pilot {
    public int pilotId = 9001;
    public String name = "Captain Smith";
    public char licenseType = 'A'; // A = Airline, H = Helicopter, G = Glider
    public boolean isActive = true;
    public float flightHours = 1500.5f;
    public double salary = 125000.75;
    public long phoneNumber = 9876543210L;

    public void displayPilot() {
        System.out.println("Pilot ID: " + pilotId);
        System.out.println("Name: " + name);
        System.out.println("License Type: " + licenseType);
        System.out.println("Active Status: " + isActive);
        System.out.println("Flight Hours: " + flightHours);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
