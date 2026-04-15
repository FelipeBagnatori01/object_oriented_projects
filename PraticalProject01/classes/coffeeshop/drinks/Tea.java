package PraticalProject01.classes.coffeeshop.drinks;

public class Tea extends Beverage {

    @Override
    public String getDescription() {
        return "Chá";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
