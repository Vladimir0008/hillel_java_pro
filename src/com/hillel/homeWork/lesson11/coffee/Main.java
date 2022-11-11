package com.hillel.homeWork.lesson11.coffee;

import com.hillel.homeWork.lesson11.coffee.order.CoffeeOrderBoard;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Alen");
        coffeeOrderBoard.add("Yoda");
        coffeeOrderBoard.add("Alena");
        coffeeOrderBoard.add("Yodar");

        coffeeOrderBoard.draw();
        System.out.println();
        coffeeOrderBoard.deliver(2);
        coffeeOrderBoard.draw();
        System.out.println(coffeeOrderBoard.getLastOrder());


    }
}

