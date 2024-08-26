package classes;

import exceptions.NoWattageException;

public class Radiator {
    private int wattage;

    public Radiator(int wattage) {
        this.wattage = wattage;
        try{
            if(this.wattage<=0){
                throw new NoWattageException("Incorrect wattage");
            }
        }
        catch (NoWattageException e){
            System.out.println("Wattage should be higher than 0");
        }
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }
}
