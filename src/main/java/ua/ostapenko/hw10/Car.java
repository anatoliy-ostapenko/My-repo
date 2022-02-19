package ua.ostapenko.hw10;

public class Car implements Recovery, Recovery1 {
    private String series;
    private int year;
    private String color;
    int fuelLevel;

    public Car(String series, int year, String color, int fuelLevel) {
        this.series = series;
        this.year = year;
        this.color = color;
        this.fuelLevel = fuelLevel;

    }


    public void levelEnough(int fuel) {
        if (this.fuelLevel > fuel) {
            this.fuelLevel = this.fuelLevel - fuel;
        }
    }


    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }


    public void showStatistic() {
        System.out.println("Авто:  " + "color: " + color + " series: " + series + " year" + year);
        System.out.println("Топлива осталось: " + fuelLevel);
    }

    @Override
    public void refuel(int fuel) {
        setFuelLevel(fuel);
    }
}
