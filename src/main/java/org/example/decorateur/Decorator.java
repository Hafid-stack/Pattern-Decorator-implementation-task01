package org.example.decorateur;

import org.example.composont.Drink;

public class Decorator extends Drink {
    private Drink drink;
    @Override
    public void price() {
        System.out.println("empty");
    }

    @Override
    public void description() {
        drink.description();
    }
}
