public class Main {
    public static void main(String[] args) {
        // Creating peripherals
        Keyboard keyboard = new Keyboard("KB", "Logitech", 102, 5);
        Monitor monitor = new Monitor("MN", "Samsung", 2, 18, 1700);

        // Creating CPU
        CPU cpu = new CPU(3.4, 16, 150);

        // Creating PC with peripherals and CPU
        PC pc0 = new PC(cpu, new Peripheral[]{keyboard, monitor});
        
        double powerConsumption = pc0.calculatePowerConsumption(5); // Calculating power consumption for 5 hours
        System.out.println("Power consumption of the PC: " + powerConsumption + " Watts");
    }
}