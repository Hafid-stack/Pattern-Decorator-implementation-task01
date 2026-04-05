package org.example.decorateur;

import org.example.composont.Drink;

public class Sweetner extends Decorator {


    public Sweetner(Drink drink) {
        super(drink);
    }
    @Override
    public double price() {
        return drink.price()+1.2;
    }
    @Override
    public String description() {
        return drink.description()+" with Sweetner";
    }
}
