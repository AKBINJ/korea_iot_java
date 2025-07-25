package org.example.test.test0710.자바OOP구현문제;

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape{
    double w;
    double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    double getArea() {
        return w*h;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 5);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());


    }
}
