package com.ejesposito;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 Basic Java example of inheritance and polymorphism
 * @author Ezequiel Esposito (ezequiel.esposito@gmail.com)
 * @version 1.0.0
 */
 public class Oop {

    public static void main(String[] args) {

        // Object of parent class Figure
        Figure f1 = new Figure("1");
        System.out.println(f1.getDescription());

        // Object of child class Rectangle
        Figure f2 = new Rectangle("2");
        System.out.println(f2.getDescription());

        // Object of child class Circle
        Figure f3 = new Circle("3");
        System.out.println(f3.getDescription());

        // List of Figures objects
        List<Figure> figures = Arrays.asList(f1, f2, f3);

        // Print the description of each object using a for (external iteration)
        // Because of polymorphism, each object calls his corresponding getDescription() method
        /* Output
            Type: figure, Name: 1
            Type: rectangle, Name: 2
            Type: circle, Name: 3
         */
        for (Figure f: figures) {
            System.out.println(f.getDescription());
        }

        // Print objects using forEach method and lambda expression (internal iteration)
        figures.forEach(f -> System.out.println(f.getDescription()));

        // Print objects using streams, functional programming style and bulk operations
        Stream<Figure> figureStream = figures.stream();
        figureStream.forEach(f -> System.out.println(f.getDescription()));
    }

}
