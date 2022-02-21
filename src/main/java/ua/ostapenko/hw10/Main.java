package ua.ostapenko.hw10;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("series1", 2020, "yellow", 25);
        car1.showStatistic();
        car1.moving(10);
        car1.showStatistic();
        car1.setFuelLevel(car1.recoverFuel());
       // car1.refuel(50);
        car1.showStatistic();

        Truck truck1 = new Truck("F series", 2018, "black", 43, 100);
        truck1.showStatistic();
        truck1.moving(20);
        truck1.showStatistic();
        truck1.setFuelLevel(truck1.recoverFuel());
        // truck1.refuel(50);
        truck1.showStatistic();

        PassengerCar passengerCar = new PassengerCar("series2", 2015, "green", 33, 2);
        passengerCar.showStatistic();
        passengerCar.moving(23);
        passengerCar.showStatistic();
        passengerCar.setFuelLevel(passengerCar.recoverFuel());
        passengerCar.showStatistic();

    }
}
