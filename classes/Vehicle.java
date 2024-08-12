public class Vehicle {
    private int numberOfWheels;
    private int numberOfDoors;

    private Engine engine;
    private Radiator radiator;

    public Vehicle(int numberOfWheels, int numberOfDoors, Engine engine, Radiator radiator) {
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.engine = engine;
        this.radiator = radiator;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Radiator getRadiator() {
        return radiator;
    }

    public void setRadiator(Radiator radiator) {
        this.radiator = radiator;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public Vehicle() {
    }

    public Vehicle(int numberOfWheels, int numberOfDoors) {
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
