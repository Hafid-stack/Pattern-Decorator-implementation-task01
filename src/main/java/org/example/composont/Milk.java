package org.example.composont;

public class Milk extends Drink{

    @Override
    public void description() {
        System.out.println("Milk");
    }
    @Override
    public void price() {
        System.out.println("12");
    }
}
