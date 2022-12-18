package com.hillel.homeWork.lesson8.task12.second_part;

import java.util.concurrent.Semaphore;

public class PetrolStation {
    private volatile Double fuelAmount;
    private volatile Double fuelAmountForOrder;
    private Semaphore petrolStationSemaphore = new Semaphore(3);
    ;

    public PetrolStation(double fuelAmount) {
        this.fuelAmount = fuelAmount;
        this.fuelAmountForOrder = fuelAmount;
    }

    public  void doRefuel(double litres) {
        try {
            petrolStationSemaphore.acquire();
            System.out.println("Client have driven to the petrol station.");

            try {
                fuelOrderRequest(litres);
            } catch (NotEnoughFuelException e) {
                System.out.println(e.getMessage());
                return;
            }
            Thread.sleep(((long) (3 + Math.random() * 8)) * 1000);
            fuelDecrement(litres);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            petrolStationSemaphore.release();
        }

    }

    private synchronized void fuelDecrement(double litres) {
        fuelAmount -= litres;
    }

    private synchronized void fuelOrderRequest(double litres) throws NotEnoughFuelException {
        if (fuelAmountForOrder < litres) {
            throw new NotEnoughFuelException("Not enough fuel on the station.");
        }
        fuelAmountForOrder -= litres;
        System.out.println(fuelAmountForOrder + " free litres left on the station.");
    }
}
