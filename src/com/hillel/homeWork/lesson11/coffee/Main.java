package com.hillel.homeWork.lesson11.coffee;

import com.hillel.homeWork.lesson11.coffee.order.CoffeeOrderBoard;
import com.hillel.homeWork.lesson11.coffee.order.exception.OrderNumberException;

public class Main {
    public static void main(String[] args) throws OrderNumberException {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Alen");
        coffeeOrderBoard.add("Yoda");
        coffeeOrderBoard.add("Alena");
        coffeeOrderBoard.add("Yodar");
        coffeeOrderBoard.draw();
        System.out.println();
        coffeeOrderBoard.deliver(2);
        coffeeOrderBoard.draw();
        System.out.println();
        coffeeOrderBoard.add("Dart Weider");
        coffeeOrderBoard.add("Alen1");
        coffeeOrderBoard.add("Yoda1");
        coffeeOrderBoard.add("Alena1");
        coffeeOrderBoard.add("Yodar1");
        coffeeOrderBoard.deliver(3);
        coffeeOrderBoard.draw();
        System.out.println();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();
        System.out.println();
        coffeeOrderBoard.draw();


    }
}

