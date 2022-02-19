package ua.ostapenko.hw10;

public class PassengerCar extends Car {
    private int passenger;

    public PassengerCar(String series, int year, String color, int fuelLevel, int passenger) {
        super(series, year, color, fuelLevel);
        this.passenger = passenger;
    }

    public void addPassengers(int num) {
        if (num <= 3 & num > 0) {
            this.passenger = num;
        }
    }

}