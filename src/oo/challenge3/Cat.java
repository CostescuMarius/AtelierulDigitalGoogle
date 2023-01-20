package oo.challenge3;

public class Cat extends Animal implements Pet{
    private String name;

    protected Cat(String name) {
        super(4);
        this.name = name;
    }

    protected Cat() {
        this("");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Pisica se joaca!");
    }

    public void eat() {
        System.out.println("Pisica mananca!");
    }
}
