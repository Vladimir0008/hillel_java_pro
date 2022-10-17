package com.hillel.homeWork.lesson3.task6_polymorphism.geometric;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(6.15D);
        Circle circle2 = new Circle(2);
        Triangle triangle1 = new Triangle(2,3,4);
        Triangle triangle2 = new Triangle(5,6.15D,3.2D);
        Square square1 = new Square(2);
        Square square2 = new Square(4);

        System.out.println(circle1.figureArea());
        System.out.println(circle2.figureArea());
        System.out.println(triangle1.figureArea());
        System.out.println(triangle2.figureArea());
        System.out.println(square1.figureArea());
        System.out.println(square2.figureArea());

        GeometricFigure[] test = {circle1,circle2,triangle1,triangle2,square1,square2};

        System.out.println("The total area of our figures is " + totalArea(test));
    }

    public static double totalArea(GeometricFigure[] geometricFigures) {
        double result = 0;
        for (int i = 0; i < geometricFigures.length; i++) {
            result += geometricFigures[i].figureArea();
        }
        return result;
    }
}
