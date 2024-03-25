public class CPU {
    private double cpuFrequency;
    private int ramCapacity;
    private double power;

    // Constructor with parameters
    public CPU(double cpuFrequency, int ramCapacity, double power) {
        this.cpuFrequency = cpuFrequency;
        this.ramCapacity = ramCapacity;
        this.power = power;
    }

    // Copy constructor
    public CPU(CPU cpu) {
        this.cpuFrequency = cpu.cpuFrequency;
        this.ramCapacity = cpu.ramCapacity;
        this.power = cpu.power;
    }

    // Getter
    public double getPower() {
        return power;
    }
}