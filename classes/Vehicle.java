public class Vehicle {
    private int numberOfWheels;
    private int numberOfDoors;

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
