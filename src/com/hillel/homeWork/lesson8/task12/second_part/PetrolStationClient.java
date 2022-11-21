package com.hillel.homeWork.lesson8.task12.second_part;

public class PetrolStationClient implements Runnable {
    private int fuelOrder;
    private PetrolStation petrolStation;

    public PetrolStationClient(int fuelOrder, PetrolStation petrolStation) {
        this.fuelOrder = fuelOrder;
        this.petrolStation = petrolStation;
    }

    public void run() {
            System.out.println("Client have driven to the petrol station.");
            petrolStation.doRefuel(fuelOrder);
            System.out.println("Client have driven away from the petrol station.");
            System.out.println("Petrol station have " + petrolStation.getFuelAmount() + " litres of fuel.");
        }


    public int getFuelOrder() {
        return fuelOrder;
    }

    public void setFuelOrder(int fuelOrder) {
        this.fuelOrder = fuelOrder;
    }

    public PetrolStation getPetrolStation() {
        return petrolStation;
    }

}
