package ua.ostapenko.hw10;

public class PassengerCar extends Car {
    private int passenger;

    public PassengerCar(String series, int year, String color, int fuelLevel, int passenger) {
        super(series, year, color, fuelLevel);
        this.passenger = passenger;
    }

    public void addPassengers() {
        if (this.passenger < 3 ) {
            this.passenger ++;
        }
        else {
            System.out.println("It's not free places");
        }
    }

}