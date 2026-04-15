package PraticalProject01.classes.coffeeshop.decorators;

import PraticalProject01.classes.coffeeshop.drinks.Beverage;

public abstract class BeverageDecorator extends Beverage {
    protected final Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract double getCost();
}
