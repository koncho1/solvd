package classes;

import exceptions.NegativeNumberOfDoorsException;
import exceptions.NoEngineVolumeException;
import exceptions.NoTopSpeedException;
import exceptions.NoWheelsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoWheelsException, NoTopSpeedException {
        Engine engine=new Engine("gasoline",1.5f);
        Engine truckEngine=new Engine("diesel",6f);
        Radiator radiator= new Radiator(60);
        RaceCar car=new RaceCar(4,0,300);
        Bus bus=new Bus(6,2,40,10000);
        Motorcycle motorcycle=new Motorcycle(2,0,engine,radiator,300);
        int in=0;
        try(Scanner scanner=new Scanner(System.in)) {
            System.out.println("Enter number of doors");
            in=scanner.nextInt();
            if(in<0){
                throw new NegativeNumberOfDoorsException("Wrong number of doors");
            }
        }
        catch (NegativeNumberOfDoorsException e){
            System.out.println("Number of doors should be 0 or higher");
        }
        Truck truck=new Truck(10,2,truckEngine,radiator,6000);
        System.out.println(Bus.getNumberOfBusses());

    }
}