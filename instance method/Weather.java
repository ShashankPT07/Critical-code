class Weather {

    public float[] temperatures = {28.5f, 30.0f, 27.8f, 29.4f};

    public void reportTemperatures() {
        System.out.println(temperatures.length);
        for (int num = 0; num < temperatures.length; num++) {
            System.out.println("Temperature: " + temperatures[num]);
        }
    }
}


