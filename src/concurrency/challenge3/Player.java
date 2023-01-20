package concurrency.challenge3;

import java.util.Random;

public class Player extends Thread {
    private static final String[] OPTIONS = {"rock", "paper", "scissors"};
    private Random random;

    public Player() {
        random = new Random();
    }

    public String getHand() {
        int index = random.nextInt(OPTIONS.length);
        return OPTIONS[index];
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            String hand = getHand();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
