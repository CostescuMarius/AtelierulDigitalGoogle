package concurrency.challenge3;

public class Play {
    public static void main(String[] args) throws InterruptedException {
        Player player1 = new Player();
        Player player2 = new Player();

        player1.start();
        player2.start();

        // Wait for the threads to finish
        player1.join();
        player2.join();

        String hand1 = player1.getHand();
        String hand2 = player2.getHand();

        System.out.println("Player 1: " + hand1);
        System.out.println("Player 2: " + hand2);

        if (hand1.equals(hand2)) {
            System.out.println("It's a tie!");
        } else if (
                (hand1.equals("rock") && hand2.equals("scissors")) ||
                        (hand1.equals("scissors") && hand2.equals("paper")) ||
                        (hand1.equals("paper") && hand2.equals("rock"))
        ) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}