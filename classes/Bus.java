public class Bus extends Vehicle {
    private int numberOfSeats;
    private int weight;

    public Bus(int numberOfWheels, int numberOfDoors, int numberOfSeats, int weight) {
        super(numberOfWheels, numberOfDoors);
        this.numberOfSeats = numberOfSeats;
        this.weight = weight;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
