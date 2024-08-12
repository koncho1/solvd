public class Motorcycle extends Vehicle {
    private int topSpeed;
    private String engine;

    public Motorcycle(int numberOfWheels, int numberOfDoors, int topSpeed) {
        super(numberOfWheels, numberOfDoors);
        this.topSpeed = topSpeed;
    }

    public Motorcycle(int numberOfWheels, int numberOfDoors, int topSpeed, String engine) {
        super(numberOfWheels, numberOfDoors);
        this.topSpeed = topSpeed;
        this.engine = engine;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
