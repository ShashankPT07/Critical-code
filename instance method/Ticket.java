class Ticket {

    public int[] ticketSeats = {1, 2, 3, 4};

    public void printTicketSeats() {
        System.out.println(ticketSeats.length);
        for (int num = 0; num < ticketSeats.length; num++) {
            System.out.println("Seat Number: " + ticketSeats[num]);
        }
    }
}


