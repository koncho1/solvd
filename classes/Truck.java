public class Truck extends Vehicle {
    private int capacity;

    public Truck(int numberOfWheels, int numberOfDoors, Engine engine, Radiator radiator, int capacity) {
        super(numberOfWheels, numberOfDoors, engine, radiator);
        this.capacity = capacity;
    }

    public Truck(int numberOfWheels, int numberOfDoors) {
        super(numberOfWheels, numberOfDoors);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
