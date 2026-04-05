package org.example.decorateur;

import org.example.composont.Drink;

public abstract class Decorator extends Drink {
    protected Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

}
