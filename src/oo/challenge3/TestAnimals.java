package oo.challenge3;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();
        d.setName("Pestisorul de aur");
        System.out.println(c.getName());
        d.play();
        System.out.println();

        c.eat();
        c.walk();
        System.out.println(c.getName());
        c.setName("Tommy");
        c.play();
        System.out.println();

        a.eat();
        a.walk();
        System.out.println();

        e.eat();
        e.walk();
        System.out.println();

        p.setName("Tommy");
        System.out.println(p.getName());
        p.play();
        System.out.println();
    }
}
