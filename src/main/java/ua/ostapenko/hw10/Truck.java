package ua.ostapenko.hw10;

public class Truck extends Car {
    int cargo;

    public Truck(String series, int year, String color, int fuelLevel, int cargo) {
        super(series, year, color, fuelLevel);
        this.cargo = cargo;
    }

    public int cargoCount(int cargo) {
        return cargo;
    }

    @Override
    public void levelEnough(int fuel) {
        if (this.getFuelLevel() > fuel * 2) {
            this.fuelLevel = this.fuelLevel - fuel * 2;
        }
    }

}
