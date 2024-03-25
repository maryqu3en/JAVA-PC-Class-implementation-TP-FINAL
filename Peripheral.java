public abstract class Peripheral {
    protected String id;
    protected String model;

    // Constructor with parameters
    public Peripheral(String id, String model) {
        this.id = id;
        this.model = model;
    }

    // Copy constructor
    public Peripheral(Peripheral peripheral) {
        this.id = peripheral.id;
        this.model = peripheral.model;
    }

    // Abstract method to calculate power
    public abstract double calculatePower();
}