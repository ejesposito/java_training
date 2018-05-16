package com.ejesposito;

/**
 Basic Java class
 * @author Ezequiel Esposito (ezequiel.esposito@gmail.com)
 * @version 1.0.0
 */
public class Figure {

    // Variable common to all the instances (objetcs) of the class Figure
    // Private variable that can't be accessed from outside the objetc
    private static String figureType = "Figure";

    // Variable unique to each instance (objetc) of the class Figure
    private String name = null;

    // Constructor
    Figure(String name) {
        this.name = figureType + " name: " + name;
    }

    // Public method that can be accessed from outise the objetc
    public String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = figureType + " name: " + name;
    }

    // Public static method common to all the instances (objetcs) of the class Figure
    public static String getFigureType() {
        return "Figure type: " + figureType;
    }

}
