class Travel {

    public char[] routeCodes = {'X', 'Y', 'Z', 'W'};

    public void displayRouteCodes() {
        System.out.println(routeCodes.length);
        for (int num = 0; num < routeCodes.length; num++) {
            System.out.println("Route Code: " + routeCodes[num]);
        }
    }
}


