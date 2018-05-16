package com.ejesposito;

/**
 Child class Rectangle
 * @author Ezequiel Esposito (ezequiel.esposito@gmail.com)
 * @version 1.0.0
 */
public class Rectangle extends Figure {

    Rectangle(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Type: rectangle, Name: " + this.name;
    }

}
