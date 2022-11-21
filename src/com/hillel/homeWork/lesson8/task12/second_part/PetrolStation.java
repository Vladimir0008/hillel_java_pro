package com.hillel.homeWork.lesson8.task12.second_part;

import java.util.concurrent.Semaphore;

public class PetrolStation {
    private volatile Double fuelAmount;
    Semaphore petrolStationSemaphore = new Semaphore(3);
    ;

    public PetrolStation(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void doRefuel(double litres) {
        try {
            petrolStationSemaphore.acquire();
            synchronized (fuelAmount) {
                if (fuelAmount == 0) {
                    System.out.println(("We are closed because we have no fuel"));
                } else if (fuelAmount < litres && fuelAmount > 0) {
                    System.out.println(("The fuel on petrol station is not enough. There is only " + getFuelAmount() + " litres"));
                    Thread.sleep(((long) (3 + Math.random() * 8)) * 1000);
                    fuelAmount = 0D;
                } else {
                    Thread.sleep(((long) (3 + Math.random() * 8)) * 1000);
                    fuelAmount -= litres;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            petrolStationSemaphore.release();
        }

    }

    public double getFuelAmount() {
        return fuelAmount;
    }
}
