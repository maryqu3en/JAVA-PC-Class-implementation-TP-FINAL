class PC {
    CPU cpu;
    Peripheral[] peripherals;

    public PC(CPU cpu, Peripheral[] peripherals) {
        this.cpu = cpu;
        this.peripherals = peripherals;
    }

    public double calculatePowerConsumption(int duration) {
        double totalPower = cpu.getPower(); 
        for (Peripheral peripheral : peripherals) {
            totalPower += peripheral.calculatePower(); 
        }

        return totalPower * duration;        
    }
}












