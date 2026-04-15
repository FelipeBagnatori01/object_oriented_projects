package PraticalProject01.classes.coffeeshop.decorators;

import PraticalProject01.classes.coffeeshop.drinks.Beverage;

public class Cinnamon extends BeverageDecorator {

    public Cinnamon(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Canela";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.75;
    }
}
