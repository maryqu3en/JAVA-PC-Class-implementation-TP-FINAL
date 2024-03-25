class PC {
    private CPU cpu;
    private Peripheral[] peripherals;

    // Constructor with parameters
    public PC(CPU cpu, Peripheral[] peripherals) {
        this.cpu = cpu;
        this.peripherals = peripherals;
    }

    // Constructor taking another PC object as argument
    public PC(PC pc) {
        this.cpu = new CPU(pc.cpu);
        this.peripherals = new Peripheral[pc.peripherals.length];
        for (int i = 0; i < pc.peripherals.length; i++) {
            this.peripherals[i] = new Peripheral(pc.peripherals[i]);
        }
    }

    // Method to calculate the electrical consumption of the PC
    public double calculatePowerConsumption(int duration) throws PowerConsumptionException {
        double totalPower = cpu.getPower(); // Power consumption of the CPU
        for (Peripheral peripheral : peripherals) {
            totalPower += peripheral.calculatePower(); // Power consumption of each peripheral
        }

        double totalPowerHour = totalPower * duration;
        if (totalPowerHour > 1000) {
            throw new PowerConsumptionException("Power consumption exceeds 1000 Watts!");
        }
        
        return totalPowerHour;
    }
}












