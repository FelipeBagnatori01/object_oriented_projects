package PraticalProject01.classes.coffeeshop.decorators;

import PraticalProject01.classes.coffeeshop.drinks.Beverage;

public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Leite";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 1.50;
    }
}
