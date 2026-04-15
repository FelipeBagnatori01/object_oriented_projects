package PraticalProject01.classes.coffeeshop.drinks;

public abstract class Beverage {
    public abstract String getDescription();
    public abstract double getCost();

    @Override
    public String toString() {
        return getDescription() + " -> R$ " + String.format("%.2f", getCost());
    }
}
