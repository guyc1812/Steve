package com.avengers.steve.DesignPattern.Factory.FactoryMethod.NewYork;

import com.avengers.core.demo.DesignPattern.Factory.FactoryMethod.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese AbstractPizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
