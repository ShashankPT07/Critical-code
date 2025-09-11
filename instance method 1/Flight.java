 class Flight {

    public int flightNumber = 101;
    public String origin = "New York";
    public char destination = "L";
    public long durationMinutes = 420L;
    public boolean isDirect = true;
    public double ticketPrice = 850.75;

    public int flightNumber() {
        System.out.println(flightNumber);
        return flightNumber;
    }

    public String origin() {
        System.out.println(origin);
        return origin;
    }

    public char destination() {
        System.out.println(destination);
        return destination;
    }

    public long durationMinutes() {
        System.out.println(durationMinutes);
        return durationMinutes;
    }

    public boolean isDirect() {
        System.out.println(isDirect);
        return isDirect;
    }

    public double ticketPrice() {
        System.out.println(ticketPrice);
        return ticketPrice;
    }
}
