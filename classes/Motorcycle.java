public class Motorcycle extends Vehicle {
    private int topSpeed;

    public int getTopSpeed() {
        return topSpeed;
    }

    public Motorcycle(int numberOfWheels, int numberOfDoors, Engine engine, Radiator radiator, int topSpeed) {
        super(numberOfWheels, numberOfDoors, engine, radiator);
        this.topSpeed = topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
