package oo.challenge3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract public void eat();

    public void walk() {
        System.out.println("Animalul merge cu cele " + legs + " picioare");
    }
}
