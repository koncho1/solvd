public class RaceCar extends Vehicle{
    private int topSpeed;

    public RaceCar(int numberOfWheels, int numberOfDoors, int topSpeed) {
        super(numberOfWheels, numberOfDoors);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
