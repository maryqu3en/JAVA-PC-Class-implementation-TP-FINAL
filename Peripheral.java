public abstract class Peripheral {
    protected String id;
    protected String model;

    public Peripheral(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public abstract double calculatePower();
}