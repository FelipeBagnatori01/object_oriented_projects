package PraticalProject01.classes.coffeeshop.drinks;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
