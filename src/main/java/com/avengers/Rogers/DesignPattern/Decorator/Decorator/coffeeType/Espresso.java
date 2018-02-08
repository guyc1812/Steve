package com.avengers.Rogers.DesignPattern.Decorator.Decorator.coffeeType;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
