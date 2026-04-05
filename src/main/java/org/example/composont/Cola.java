package org.example.composont;

public class Cola extends Drink{

    @Override
    public void description() {
        System.out.println("Cola");
    }
    @Override
    public void price() {

        System.out.println("price is 20");
    }
}
