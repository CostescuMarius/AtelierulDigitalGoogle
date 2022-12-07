package patterns.decorator;

public class Chocolate extends Toping{
    public Chocolate (Beverage beverage) {
        super(beverage, "chocolate, ", 4);
    }
}
