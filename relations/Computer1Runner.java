class Computer1Runner {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel Core i7");
        Computer1 computer = new Computer1(cpu);
        computer.displayComputer();
    }
}
