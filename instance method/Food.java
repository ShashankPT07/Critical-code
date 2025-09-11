class Food {

    public int[] foodCodes = {11, 22, 33, 44};

    public void listFoodCodes() {
        System.out.println(foodCodes.length);
        for (int num = 0; num < foodCodes.length; num++) {
            System.out.println("Food Code: " + foodCodes[num]);
        }
    }
}


