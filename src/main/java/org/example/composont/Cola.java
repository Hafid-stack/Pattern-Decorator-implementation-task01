package org.example.composont;

public class Cola extends Drink{

    public Cola(){
        description = "Cola";
    }

    @Override
    public double price() {
        return 22;
    }
}
