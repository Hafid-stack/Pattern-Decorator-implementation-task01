package org.example.composont;

public class Espresso extends Drink{

    @Override
    public void description() {
        System.out.println("Espresso");
    }
    @Override
    public void price() {
        System.out.println("15");    }
}
