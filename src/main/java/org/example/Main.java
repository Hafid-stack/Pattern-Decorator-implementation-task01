package org.example;

import org.example.composont.Cola;
import org.example.composont.Drink;
import org.example.decorateur.Caramel;
import org.example.decorateur.Chocolat;
import org.example.decorateur.Sweetner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Drink drink = new Cola();
        System.out.println(drink.description());
        System.out.println(drink.price());
        System.out.println("***********************\n");

        drink=new Caramel(drink);
        System.out.println(drink.description());
        System.out.println(drink.price());
        System.out.println("***********************\n");


        drink=new Chocolat(drink);
        System.out.println(drink.description());
        System.out.println(drink.price());
        System.out.println("***********************\n");


        drink=new Sweetner(drink);
        System.out.println(drink.description());
        System.out.println(drink.price());

    }
}