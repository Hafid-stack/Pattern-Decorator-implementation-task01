package org.example.decorateur;

import org.example.composont.Drink;

public class Chocolat extends Decorator {


    public Chocolat(Drink drink) {
        super(drink);
    }
    @Override
    public double price() {
        return drink.price()+2.2;
    }
    @Override
    public String description() {
        return drink.description()+" with Chocolat";
    }
}
