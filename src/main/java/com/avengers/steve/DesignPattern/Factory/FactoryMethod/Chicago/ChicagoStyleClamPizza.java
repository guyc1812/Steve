package com.avengers.steve.DesignPattern.Factory.FactoryMethod.Chicago;

import com.avengers.core.demo.DesignPattern.Factory.FactoryMethod.Pizza;

public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam AbstractPizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
