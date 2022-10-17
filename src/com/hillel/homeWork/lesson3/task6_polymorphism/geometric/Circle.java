package com.hillel.homeWork.lesson3.task6_polymorphism.geometric;

public class Circle implements GeometricFigure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double figureArea() {
        double result = Math.PI * radius * radius;
        return result;
    }
}
