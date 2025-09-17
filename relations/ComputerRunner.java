class ComputerRunner {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel i7");
        Computer computer = new Computer(processor);
        computer.displayComputer();
    }
}