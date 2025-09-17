class Computer {
    public String processorModel;
    public Processor processor;

    public Computer(Processor processor) {
        this.processorModel = processor.model;
        this.processor = processor;
    }

    public void displayComputer() {
        processor.displayProcessor();
    }
}