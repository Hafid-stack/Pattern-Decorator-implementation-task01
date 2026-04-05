package org.example.decorateur;

import org.example.composont.Drink;

public class Caramel extends Decorator {


    public Caramel(Drink drink) {
        super(drink);
    }
    @Override
    public double price() {
        return drink.price()+3;
    }
    @Override
    public String description() {
        return drink.description()+" with Caramel";
    }
}
