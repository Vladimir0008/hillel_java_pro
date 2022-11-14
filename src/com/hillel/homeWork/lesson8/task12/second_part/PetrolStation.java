package com.hillel.homeWork.lesson8.task12.second_part;

public class PetrolStation {
    private volatile double fuelAmount;

    public PetrolStation(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public synchronized void doRefuel(double litres) throws InterruptedException {
        if (fuelAmount == 0) {
            System.out.println(("We are closed because we have no fuel"));
        } else if (fuelAmount < litres && fuelAmount > 0) {
            System.out.println(("The fuel on petrol station is not enough. There is only " + getFuelAmount() + " litres"));
            Thread.sleep(((long) (3 + Math.random() * 8)) * 1000);
            fuelAmount = 0;
        } else {
            Thread.sleep(((long) (3 + Math.random() * 8)) * 1000);
            fuelAmount -= litres;
        }
    }

    public double getFuelAmount() {
        return fuelAmount;
    }
}
