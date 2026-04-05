package org.example.composont;

public class Tea extends Drink {


    public Tea() {
        description = "Tea";
    }
    @Override
    public double price() {
        return 5.5;
    }
}
