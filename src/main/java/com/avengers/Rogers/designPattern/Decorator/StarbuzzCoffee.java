package com.avengers.Rogers.designPattern.Decorator;

import com.avengers.Rogers.designPattern.Decorator.Condiment.Mocha;
import com.avengers.Rogers.designPattern.Decorator.Condiment.Soy;
import com.avengers.Rogers.designPattern.Decorator.Condiment.Whip;
import com.avengers.Rogers.designPattern.Decorator.coffeeType.Beverage;
import com.avengers.Rogers.designPattern.Decorator.coffeeType.DarkRoast;
import com.avengers.Rogers.designPattern.Decorator.coffeeType.Espresso;
import com.avengers.Rogers.designPattern.Decorator.coffeeType.HouseBlend;

public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
