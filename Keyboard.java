public class Keyboard extends Peripheral {
    private int numKeys;
    private double power;

    // Constructor with parameters
    public Keyboard(String id, String model, int numKeys, double power) {
        super(id, model);
        this.numKeys = numKeys;
        this.power = power;
    }

    // Method to calculate power consumption of the keyboard (constant)
    @Override
    public double calculatePower() {
        return power;
    }
}