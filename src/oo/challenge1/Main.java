package oo.challenge1;

public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Fighter", 100, 20);
        Fighter f2 = new Fighter("Fighter", 100, 20);

        BoxingMatch b = new BoxingMatch(f1, f2);
        b.fight();
    }
}
