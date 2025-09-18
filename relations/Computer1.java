class Computer1 {
    public String computerCPU;
    public CPU cpu;

    public Computer1(CPU cpu) {
        this.computerCPU = cpu.model;
        this.cpu = cpu;
    }

    public void displayComputer() {
        cpu.cpuDetails();
    }
}
