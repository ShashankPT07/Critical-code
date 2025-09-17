
class CarRunner {
    public static void main(String[] args) {
        Engine engine = new Engine("V8 Engine");
        Car car = new Car(engine);
        car.displayCar();
    }
}
