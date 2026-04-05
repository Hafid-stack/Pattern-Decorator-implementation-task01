package org.example.composont;

public abstract class Drink {
    protected String description;
    public String description(){
        return description;
    };
    public abstract double price();
}
