package ua.ostapenko.hw10;

interface Recovery {
    int maxFuel = 50;

    private int refuel() {
        return maxFuel;
    }

    default int recoverFuel() {
        return refuel();
    }
}

//interface Recovery1 {
//    void refuel(int fuel);
//}
