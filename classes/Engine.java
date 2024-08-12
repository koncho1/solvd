public class Engine {
    private String fuelType;
    private float volume;

    public Engine(String fuelType, float volume) {
        this.fuelType = fuelType;
        this.volume = volume;
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
