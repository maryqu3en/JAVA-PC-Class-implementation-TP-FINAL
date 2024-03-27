public class CPU {
    private double cpuFrequency;
    private int ramCapacity;
    private double power;

    public CPU(double cpuFrequency, int ramCapacity, double power) {
        this.cpuFrequency = cpuFrequency;
        this.ramCapacity = ramCapacity;
        this.power = power;
    }

    public double getPower() {
        return power;
    }
}