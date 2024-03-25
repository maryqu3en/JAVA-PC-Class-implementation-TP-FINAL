public class Monitor extends Peripheral {
    private int powerClass;
    private int dimension;
    private int maxResolution;

    // Constructor with parameters
    public Monitor(String id, String model, int powerClass, int dimension, int maxResolution) {
        super(id, model);
        this.powerClass = powerClass;
        this.dimension = dimension;
        this.maxResolution = maxResolution;
    }

    // Method to calculate power consumption of the monitor
    @Override
    public double calculatePower() {
        return powerClass * dimension + maxResolution * 0.015;
    }
}