class PC {
    CPU cpu;
    Peripheral[] peripherals;

    public PC(CPU cpu, Peripheral[] peripherals) {
        this.cpu = cpu;
        this.peripherals = peripherals;
    }

    public double calculatePowerConsumption(int duration) throws ConsoException {
        double totalPower = cpu.getPower(); 
        for (Peripheral peripheral : peripherals) {
            totalPower += peripheral.calculatePower(); 
        }
        float pwrconso = totalPower * duration;
        if (pwrconso > 1000) {
            throw new ConsoException("Power consumption exceeds 1000 Watts");
        }
        return pwrconso;        
    }
}
