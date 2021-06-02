package com.alfa.work2;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                " radius=" + radius +
                ';';
    }

    @Override
    public double calcArea() {
        return radius * radius * Math.PI;
    }

}
