import java.util.Objects;

public class Truck extends Vehicle implements ILoad,IAlarm {
    private int capacity;

    public Truck(int numberOfWheels, int numberOfDoors, Engine engine, Radiator radiator, int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void Ride() {
        System.out.println("vrr");
    }

    public Truck(int numberOfWheels, int numberOfDoors) {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return capacity == truck.capacity;
    }

    @Override
    public void Load() {
        System.out.println("Loaded");
    }

    public void Unload(){
        System.out.println("unloaded");
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(capacity);
    }

    public final void loadPackage(){
        System.out.println("Load cargo on the truck");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "capacity=" + capacity +
                ", numberOfWheels=" + numberOfWheels +
                ", numberOfDoors=" + numberOfDoors +
                ", engine=" + engine +
                ", radiator=" + radiator +
                '}';
    }
}
