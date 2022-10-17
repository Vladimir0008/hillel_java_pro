package com.hillel.homeWork.lesson3.task6_polymorphism.geometric;

public class Triangle implements GeometricFigure{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double figureArea() {
        double halfOfPerimeter = (a + b + c) / 2.0;
        double result =  Math.sqrt(halfOfPerimeter * (halfOfPerimeter - a) * (halfOfPerimeter - b) * (halfOfPerimeter - c));
        return result;
    }
}
