package com.hillel.homeWork.lesson11.coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orderList = new ArrayList<>();
    private int lastOrder = orderList.size();

    public void add(String personName) {
        orderList.add(new Order(orderList.size() + 1, personName));
        lastOrder++;
    }

    public void deliver() {
        if (orderList.size() > 0) {
            for (int i = 1; i < orderList.size(); i++) {
                orderList.get(i).setOrderNumber(i);
            }
            orderList.remove(0);
            lastOrder--;
        } else {
            throw new ArrayIndexOutOfBoundsException("Our queue is empty!");
        }
    }

    public void deliver(int orderNumber) {
        if (!(orderNumber > 0 && orderNumber <= getLastOrder())) {
            throw new ArrayIndexOutOfBoundsException("Desired order doesn't exist!");
        } else {
            for (int i = orderNumber; i < orderList.size(); i++) {
                orderList.get(i).setOrderNumber(i);
            }
            orderList.remove(orderNumber - 1);
            lastOrder--;
        }
    }

    public void draw() {
        for (Order o : getOrderList()) {
            System.out.println(o);
        }
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public int getLastOrder() {
        return lastOrder;
    }
}
