package org.example.test0710.자바OOP구현문제;

import java.awt.geom.Area;

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape{
    double r;

    @Override
    double getArea() {
        return r*r;
    }
}

class Rectangle extends Shape{
    double w;
    double h;

    @Override
    double getArea() {
        return (w*h)/2;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape Rectangle = new Rectangle();


    }
}
