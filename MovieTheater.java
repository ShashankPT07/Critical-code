class MovieTheater {

    public int seats;

    public void screen() {
        System.out.println("Movie is playing on the screen");
    }

    public void soundSystem() {
        System.out.println("High-quality sound system in the theater");
        screen();
    }

    public void snacks() {
        System.out.println("Snacks available at the counter");
        soundSystem();
    }

    public void ticketBooking() {
        System.out.println("Online and offline ticket booking");
        snacks();
    }

    public void showTimings() {
        System.out.println("Movie show timings");
        ticketBooking();
    }
}
