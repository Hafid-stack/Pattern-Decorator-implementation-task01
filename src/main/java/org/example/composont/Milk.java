package org.example.composont;

public class Milk extends Drink{

    public Milk (){
        description = "Milk";
    }
    @Override
    public double price() {
        return 11;
    }
}
