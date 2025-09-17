
class Car {
    public String name;
    public Engine engine;

    public Car(Engine engine) {
        this.name = engine.name;
        this.engine = engine;
    }

    public void displayCar() {
        engine.displayEngine();
    }
}
