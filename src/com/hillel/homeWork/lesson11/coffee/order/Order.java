package com.hillel.homeWork.lesson11.coffee.order;

public class Order {
    private int orderNumber;
    private String personName;

    public Order(int orderNumber, String personName) {
        this.orderNumber = orderNumber;
        this.personName = personName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPersonName() {
        return personName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber= " + orderNumber +
                " | personName= '" + personName + '\'' +
                '}';
    }
}
