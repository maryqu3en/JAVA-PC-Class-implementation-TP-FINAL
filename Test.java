public class Test {
    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard("KB", "Logitech", 102, 5);
        Monitor monitor = new Monitor("MN", "Samsung", 2, 18, 1700);


        CPU cpu = new CPU(3.4, 16, 150);


        PC pc = new PC(cpu, new Peripheral[]{keyboard, monitor});
        
        double powerConsumption = pc.calculatePowerConsumption(5);
        System.out.println("Power consumption of the PC: " + powerConsumption + " Watts");
    }
}