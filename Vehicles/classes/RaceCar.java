package classes;

import exceptions.NoTopSpeedException;
import interfaces.IChangeTire;
import interfaces.ICheckEngine;

import java.util.Objects;

public class RaceCar extends Vehicle implements ICheckEngine, IChangeTire {
    private int topSpeed;


    @Override
    public String toString() {
        return "classes.RaceCar{" +
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
        if (!(o instanceof RaceCar raceCar)) return false;
        return topSpeed == raceCar.topSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(topSpeed);
    }

    @Override
    public void Ride() {

    }

    public boolean CheckEngine(){
        return true;
    }

    public RaceCar(int numberOfWheels, int numberOfDoors, int topSpeed) throws NoTopSpeedException {

        this.topSpeed = topSpeed;
        if(this.topSpeed<=0){
            throw new NoTopSpeedException("Top speed should be higher than 0");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public void ChangeTire() {
        System.out.println("Tire changed");
    }
}
