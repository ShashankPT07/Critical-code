class Engine {

    public double[] enginePowers = {1.5, 2.0, 2.5, 3.0};

    public void listEnginePowers() {
        System.out.println(enginePowers.length);
        for (int num = 0; num < enginePowers.length; num++) {
            System.out.println("Engine Power: " + enginePowers[num]);
        }
    }
}