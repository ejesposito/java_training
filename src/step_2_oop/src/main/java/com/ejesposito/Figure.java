package com.ejesposito;

/**
 Parent class
 * @author Ezequiel Esposito (ezequiel.esposito@gmail.com)
 * @version 1.0.0
 */
public class Figure {

    // Variable unique to each instance (objetc) of the class Figure
    protected String name = null;

    // Constructor with parameters
    Figure(String name) {
        this.name = name;
    }

    // Public method that can be accessed from outise the objetc
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return "Type: figure, Name: " + name;
    }
}
