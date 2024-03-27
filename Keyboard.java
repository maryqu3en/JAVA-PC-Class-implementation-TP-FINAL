public class Keyboard extends Peripheral {
    private int numKeys;
    private double power;

    public Keyboard(String id, String model, int numKeys, double power) {
        super(id, model);
        this.numKeys = numKeys;
        this.power = power;
    }

    @Override
    public double calculatePower() {
        return power;
    }
}