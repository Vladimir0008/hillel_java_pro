package com.hillel.homeWork.lesson8.task12.second_part;

import java.util.concurrent.Semaphore;

public class PetrolStationClient implements Runnable {
    private int fuelOrder;
    private Semaphore petrolStationSemaphore;
    private PetrolStation petrolStation;

    public PetrolStationClient(int fuelOrder, Semaphore petrolStationSemaphore, PetrolStation petrolStation) {
        this.fuelOrder = fuelOrder;
        this.petrolStationSemaphore = petrolStationSemaphore;
        this.petrolStation = petrolStation;
    }

    public void run() {
        try {
            petrolStationSemaphore.acquire();
            System.out.println("Client have driven to the petrol station.");
            petrolStation.doRefuel(fuelOrder);
            System.out.println("Client have driven away from the petrol station.");
            System.out.println("Petrol station have " + petrolStation.getFuelAmount() + " litres of fuel.");
            petrolStationSemaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getFuelOrder() {
        return fuelOrder;
    }

    public void setFuelOrder(int fuelOrder) {
        this.fuelOrder = fuelOrder;
    }

    public Semaphore getPetrolStationSemaphore() {
        return petrolStationSemaphore;
    }

    public void setPetrolStationSemaphore(Semaphore petrolStationSemaphore) {
        this.petrolStationSemaphore = petrolStationSemaphore;
    }

    public PetrolStation getPetrolStation() {
        return petrolStation;
    }

    public void setPetrolStation(PetrolStation petrolStation) {
        this.petrolStation = petrolStation;
    }


}
