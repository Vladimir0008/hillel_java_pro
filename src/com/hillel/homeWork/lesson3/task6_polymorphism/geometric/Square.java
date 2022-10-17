package com.hillel.homeWork.lesson3.task6_polymorphism.geometric;

public class Square implements GeometricFigure{

    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


    public double figureArea() {
        double result = a * a;
        return result;
    }
}
