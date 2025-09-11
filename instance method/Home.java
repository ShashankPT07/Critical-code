class Home {

    public long[] homeNumbers = {1001L, 1002L, 1003L, 1004L};

    public void showHomeNumbers() {
        System.out.println(homeNumbers.length);
        for (int num = 0; num < homeNumbers.length; num++) {
            System.out.println("Home Number: " + homeNumbers[num]);
        }
    }
}

