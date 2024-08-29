package classes;

import exceptions.NegativeNumberOfDoorsException;
import exceptions.NoEngineVolumeException;
import exceptions.NoTopSpeedException;
import exceptions.NoWheelsException;

import java.util.*;

public class Main {
    public static void main(String[] args) throws NoWheelsException, NoTopSpeedException {
        Engine engine=new Engine("gasoline",1.5f);
        Engine truckEngine=new Engine("diesel",6f);
        HashMap map=new HashMap<Integer,Engine>();
        map.put(1,engine);
        map.put(2,truckEngine);
        Radiator radiator= new Radiator(60);
        Radiator radiatorX= new Radiator(90);
        Radiator radiatorY= new Radiator(40);
        HashSet set= new HashSet<Radiator>();
        set.add(radiator);
        set.add(radiatorX);
        set.add(radiatorY);
        RaceCar car=new RaceCar(4,0,300);
        LinkedList raceCars=new LinkedList<RaceCar>();
        raceCars.add(car);
        Bus bus1=new Bus(6,2,40,10000);
        Bus bus2=new Bus(6,4,50,30000);
        Motorcycle motorcycle=new Motorcycle(2,0,engine,radiator,300);
        ArrayDeque motorcycles=new ArrayDeque<Motorcycle>();
        motorcycles.add(motorcycle);
        ArrayList busses=new ArrayList<Bus>();
        busses.add(bus1);
        busses.add(bus2);
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