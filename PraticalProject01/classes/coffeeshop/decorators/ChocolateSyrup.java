package PraticalProject01.classes.coffeeshop.decorators;

import PraticalProject01.classes.coffeeshop.drinks.Beverage;

public class ChocolateSyrup extends BeverageDecorator {

    public ChocolateSyrup(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Calda de Chocolate";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2.50;
    }
}
