package classes;

import classes.Vehicle;
import exceptions.NoWheelsException;
import interfaces.IHonk;

public class Bus extends Vehicle implements IHonk {
    private int numberOfSeats;
    private int weight;

    private static int numberOfBusses=0;

    public Bus(int numberOfWheels, int numberOfDoors, int numberOfSeats, int weight) throws NoWheelsException {
        this.numberOfSeats = numberOfSeats;
        this.weight = weight;
        addBus();
        if(this.numberOfWheels<0){
            throw new NoWheelsException("Incorrect number of wheels");
        }
    }

    public static int getNumberOfBusses() {
        return numberOfBusses;
    }

    private  void addBus(){
            numberOfBusses+=1;
        }

    @Override
    public void Ride() {
        System.out.println("vroom");
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

    @Override
    public String Honk() {
        return "Honk Honk!";
    }
}
