class Music {

    public boolean[] trackAvailable = {true, false, true, true};

    public void showTrackAvailability() {
        System.out.println(trackAvailable.length);
        for (int num = 0; num < trackAvailable.length; num++) {
            System.out.println("Track available: " + trackAvailable[num]);
        }
    }
}


