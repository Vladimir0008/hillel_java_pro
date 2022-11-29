package com.hillel.homeWork.lesson8.task12.second_part;

public class Main {
    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation(100);

        PetrolStationClient petrolStationClient1 = new PetrolStationClient(10,petrolStation);
        PetrolStationClient petrolStationClient2 = new PetrolStationClient(30,petrolStation);
        PetrolStationClient petrolStationClient3 = new PetrolStationClient(30,petrolStation);
        PetrolStationClient petrolStationClient4 = new PetrolStationClient(25,petrolStation);
        PetrolStationClient petrolStationClient5 = new PetrolStationClient(20,petrolStation);
        PetrolStationClient petrolStationClient6 = new PetrolStationClient(40,petrolStation);

        Thread thread1 = new Thread(petrolStationClient1);
        Thread thread2 = new Thread(petrolStationClient2);
        Thread thread3 = new Thread(petrolStationClient3);
        Thread thread4 = new Thread(petrolStationClient4);
        Thread thread5 = new Thread(petrolStationClient5);
        Thread thread6 = new Thread(petrolStationClient6);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
