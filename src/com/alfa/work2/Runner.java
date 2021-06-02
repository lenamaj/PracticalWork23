package com.alfa.work2;

import java.util.Arrays;

public class Runner {

    public void run() {

        Shape[] shapes = {
                new Circle("yellow", 12.8),
                new Circle("green", 15.0),
                new Circle("blake", 14.0),
                new Rectangle("blue", 5, 4),
                new Rectangle("white", 6, 7),
                new Rectangle("yellow", 3, 7),
                new Rectangle("brown", 6, 13),
                new Triangle("green", 11, 14, 16),
                new Triangle("pink", 12, 16, 16),
                new Triangle("blue", 10.4, 14.7, 16.8),
        };

        printShapes(shapes);
        System.out.println();
        System.out.printf("Areas all figures in the masive= %.2f\n", allAreas(shapes));
        System.out.println("Areas figures = " + Arrays.toString(sumFigures(shapes)));

    }

    public void printShapes(Shape[] shapes) {

        for (Shape elements : shapes) {

            System.out.printf("%s Figure area= %.2f\n", elements.toString(), elements.calcArea());

        }


    }

    public double allAreas(Shape[] shapes) {
        double allAreas = 0.0;

        for (int i = 0; i < shapes.length; i++) {

            allAreas = allAreas + shapes[i].calcArea();

        }
        return allAreas;

    }

    public double[] sumFigures(Shape[] shapes) {
        double sumCircle = 0.0;
        double sumRectangle = 0.0;
        double sunTriangle = 0.0;


        for (int i = 0; i < shapes.length; i++) {

            if (shapes[i] instanceof Circle) {
                sumCircle = +shapes[i].calcArea();
            }
            if (shapes[i] instanceof Triangle) {
                sunTriangle = +shapes[i].calcArea();
            } else {
                sumRectangle = +shapes[i].calcArea();
            }
        }

        return new double[]{sumCircle, sumRectangle, sunTriangle};

    }

}
