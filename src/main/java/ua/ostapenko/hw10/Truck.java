package ua.ostapenko.hw10;

public class Truck extends Car {
    int cargo;

    public Truck(String series, int year, String color, int fuelLevel, int cargo) {
        super(series, year, color, fuelLevel);
        this.cargo = cargo;
    }

    public void loadCargo() {
        if(cargo == 0){
            cargo = 100;
        }
        else{
        System.out.println("No possibility to load cargo");
        }

    }
    public void unloadCargo () {
        if(cargo > 0){
            cargo = 0;
        }
        else{
            System.out.println("Is impossible to unload cargo");
        }
    }

    @Override
    public void moving(int fuel) {
        if (this.getFuelLevel() > fuel * 2) {
            this.fuelLevel = this.fuelLevel - fuel * 2;
        }
    }

}
