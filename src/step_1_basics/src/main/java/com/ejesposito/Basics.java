package com.ejesposito;

/**
 Basic Java example
 * @author Ezequiel Esposito (ezequiel.esposito@gmail.com)
 * @version 1.0.0
 */
public class Basics {

    public static void main(String[] args) {
        // Display a string in console.
        System.out.println("Hello World!");

        // Create objects and use their public methods
        Figure f = new Figure("A1");
        System.out.println(f.getName());
        f.setName("A2");
        System.out.println(f.getName());

        // Use an static method of a class
        System.out.println(Figure.getFigureType());

        // final variable of non primitive type
        final Figure f2 = new Figure("B");
        // Can't change the reference to another new object
        // f2 = nee Figure();
        // Can change the values of the object
        f2.setName("C");
        System.out.println(f2.getName());
    }

}
