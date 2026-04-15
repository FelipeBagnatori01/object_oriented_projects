package PraticalProject01.classes.coffeeshop.decorators;

import PraticalProject01.classes.coffeeshop.drinks.Beverage;

public class WhippedCream extends BeverageDecorator {

    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chantilly";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2.00;
    }
}
