public class Main {
    public static void main(String[] args) {
        Engine engine=new Engine("gasoline",1.5f);
        Engine truckEngine=new Engine("diesel",6f);
        Radiator radiator= new Radiator(60);
        RaceCar car=new RaceCar(4,0,300);
        Bus bus=new Bus(6,2,40,10000);
        Motorcycle motorcycle=new Motorcycle(2,0,engine,radiator,300);
        Truck truck=new Truck(10,2,truckEngine,radiator,6000);
        System.out.println(Bus.getNumberOfBusses());

    }
}