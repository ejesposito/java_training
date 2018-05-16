package com.ejesposito;

/**
 Child class Circle
 * @author Ezequiel Esposito (ezequiel.esposito@gmail.com)
 * @version 1.0.0
 */
public class Circle extends Figure {

    Circle(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Type: circle, Name: " + this.name;
    }

}
