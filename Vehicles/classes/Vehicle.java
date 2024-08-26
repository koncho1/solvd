package classes;

public abstract class Vehicle {
    protected int numberOfWheels;
    protected int numberOfDoors;

    protected Engine engine;
    protected Radiator radiator;

    public  abstract void Ride();

    static {
        System.out.println("Static block");
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
