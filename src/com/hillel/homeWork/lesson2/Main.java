package com.hillel.homeWork.lesson2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        Employee employee = new Employee("Vasya","Accountant", "fff","1223", 2000);
        System.out.println(employee);

        employee.setPhoneNumber("+12345678901");
        System.out.println(employee);
    }
}
