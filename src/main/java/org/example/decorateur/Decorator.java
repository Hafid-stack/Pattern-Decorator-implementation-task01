package org.example.decorateur;

import org.example.composont.Drink;

public class Decorator extends Drink {
    private Drink drink;


    @Override
    public double price() {
        return 0;
    }
}
