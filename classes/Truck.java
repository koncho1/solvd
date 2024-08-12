public class Truck extends Vehicle {
    private int capacity;

    public Truck(int numberOfWheels, int numberOfDoors, int capacity) {
        super(numberOfWheels, numberOfDoors);
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
