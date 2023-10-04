package pl.javastart.task;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Square square1 = new Square(2);
        Square square2 = new Square(5);
        Rectangle rectangle = new Rectangle(2, 4);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(2, 3, 4);
        double square1Area = square1.calculateSquareArea();
        System.out.println("Powierzchnia kwadratu o boku " + square1.getSide() + " wynosi: " + square1Area);
        double square2Area = square2.calculateSquareArea();
        System.out.println("Powierzchnia kwadratu o boku " + square2.getSide() + " wynosi: " + square2Area);
        double rectanglePerimeter = rectangle.calculateRectPerimeter();
        System.out.println("Obwód prostokąta o bokach " + rectangle.getSide1() + " i " + rectangle.getSide2()
                + " wynosi: " + rectanglePerimeter);
        double circleArea = circle.calculateCircleArea();
        System.out.println("Powierzchnia koła o promieniu " + circle.getR() + " wynosi: " + circleArea);
        double trianglePerimeter = triangle.calculateTrianglePerimeter();
        System.out.println("Obwód trójkąta o bokach " + triangle.getSide1() + " i " + triangle.getSide2()
                + " i " + triangle.getSide3() + " wynosi: " + trianglePerimeter);
    }
}