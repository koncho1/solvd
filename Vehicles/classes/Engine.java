package classes;

import exceptions.NoEngineVolumeException;

public class Engine {
    private String fuelType;
    private float volume;

    public Engine(String fuelType, float volume) {
        this.fuelType = fuelType;
        this.volume = volume;
        try {
            if (this.volume <= 0) {
                throw new NoEngineVolumeException("Incorrect engine volume");
            }
        }
        catch (NoEngineVolumeException e){
            System.out.println("The engine volume should be higher than 0");
        }
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
