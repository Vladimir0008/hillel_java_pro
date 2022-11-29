package com.hillel.homeWork.lesson8.task12.second_part;

import java.util.concurrent.Semaphore;

public class PetrolStation {
    private volatile Double fuelAmount;
    private volatile Double fuelAmountAfterOrder;
    private Semaphore petrolStationSemaphore = new Semaphore(3);
    ;

    public PetrolStation(double fuelAmount) {
        this.fuelAmount = fuelAmount;
        this.fuelAmountAfterOrder = fuelAmount;
    }

    public  void doRefuel(double litres) {
        try {
            petrolStationSemaphore.acquire();
            System.out.println("Client have driven to the petrol station.");
            synchronized (fuelAmountAfterOrder) {
                if (fuelAmountAfterOrder == 0) {
                    System.out.println(("We are closed because we have no fuel"));
                    return;
                }

                if (fuelAmountAfterOrder < litres && fuelAmountAfterOrder > 0) {
                    Double lastFuel = fuelAmountAfterOrder;
                    fuelAmountAfterOrder = 0D;
                    Thread.sleep(((long) (3 + Math.random() * 8)) * 1000);
                    System.out.println(("It's last order. There is only " + lastFuel +
                            " litres after order and " + fuelAmount + " litres in barrel, and other clients maybe is still refueling"));
                    fuelAmount -= lastFuel;
                    System.out.println("Client have driven away from the petrol station.");
                } else {
                    fuelAmountAfterOrder -= litres;
                    Thread.sleep(((long) (3 + Math.random() * 8)) * 1000);
                    fuelAmount -= litres;
                    System.out.println("Client have driven away from the petrol station.");
                    System.out.println("Petrol station have " + getFuelAmount() + " litres of fuel.");
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
