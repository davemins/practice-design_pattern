package chap03_Decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 휘핑 크림";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
