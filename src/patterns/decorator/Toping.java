package patterns.decorator;

public abstract class Toping extends Beverage{
    private Beverage beverage;

    public Toping(Beverage beverage, String description, int cost) {
        super(description, cost);
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + super.getDescription();
    }

    public int getCost() {
        return beverage.getCost() + super.getCost();
    }
}
