package patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffe();
        Toping milk = new Milk(coffee);


        Beverage milkChocolateCoffe = new Chocolate(milk);
        System.out.println(milkChocolateCoffe.getDescription());
        System.out.println(milkChocolateCoffe.getCost());

        Beverage milkTea = new Milk(new Tea());
        System.out.println(milkTea.getDescription());
        System.out.println(milkTea.getCost());
    }
}
