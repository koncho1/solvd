import java.util.Objects;

public final class Motorcycle extends Vehicle {
    private int topSpeed;
    private final String fuelType="Petrol";

    public int getTopSpeed() {
        return topSpeed;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "topSpeed=" + topSpeed +
                ", numberOfWheels=" + numberOfWheels +
                ", numberOfDoors=" + numberOfDoors +
                ", engine=" + engine +
                ", radiator=" + radiator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return topSpeed == that.topSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(topSpeed);
    }

    @Override
    public void Ride() {
        System.out.println("vroom vroom");
    }



    public Motorcycle(int numberOfWheels, int numberOfDoors, Engine engine, Radiator radiator, int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
