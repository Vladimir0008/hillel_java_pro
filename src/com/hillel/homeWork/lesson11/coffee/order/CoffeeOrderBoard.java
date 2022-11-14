package com.hillel.homeWork.lesson11.coffee.order;

import com.hillel.homeWork.lesson11.coffee.order.exception.OrderNumberException;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orderList = new ArrayList<>();
    private int orderCount = 1;

    public void add(String personName) {
        orderList.add(new Order(orderCount++, personName));
    }

    public void deliver() {
        if (orderList.size() > 0) {
            orderList.remove(0);
        } else {
            throw new ArrayIndexOutOfBoundsException("Our queue is empty!");
        }
    }

    public void deliver(int orderNumber) throws OrderNumberException {
        int requiredOrderIndex = -1;

        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getOrderNumber() == orderNumber) {
                requiredOrderIndex = i;
            }
        }
       if(requiredOrderIndex == -1) {
            throw new OrderNumberException("Our order list does not have an order with required number.");
        }
        orderList.remove(requiredOrderIndex);
    }

    public void draw() {
        for (Order o : getOrderList()) {
            System.out.println(o);
        }
    }

    public int getNextOrderNumber() {
        if (orderList.size() > 0) {
            return orderList.get(orderList.size() - 1).getOrderNumber() + 1;
        }
        return 1;
    }

    private List<Order> getOrderList() {
        return orderList;
    }

    public int getOrderCount() {
        return orderCount;
    }
}
