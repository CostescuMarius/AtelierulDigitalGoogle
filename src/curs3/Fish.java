package curs3;

public class Fish extends Animal implements Pet{
    private String name;
    protected Fish() {
        super(0);
    }

    public void eat() {
        System.out.println("Pestele mananca!");
    }

    public void walk() {
        System.out.println("Pestele nu are picioare!");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Pestele se joaca!");
    }
}
