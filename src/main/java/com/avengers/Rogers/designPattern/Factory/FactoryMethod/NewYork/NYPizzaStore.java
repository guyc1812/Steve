package com.avengers.Rogers.designPattern.Factory.FactoryMethod.NewYork;

import com.avengers.Rogers.designPattern.Factory.FactoryMethod.Pizza;
import com.avengers.Rogers.designPattern.Factory.FactoryMethod.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
