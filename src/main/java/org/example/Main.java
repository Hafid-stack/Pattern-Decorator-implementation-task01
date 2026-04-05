package org.example;

import org.example.composont.Cola;
import org.example.composont.Drink;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Drink drink = new Cola();
        System.out.println(drink.description());
        System.out.println(drink.price());


    }
}