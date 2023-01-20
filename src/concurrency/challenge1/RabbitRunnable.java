package concurrency.challenge1;

public class RabbitRunnable implements Runnable{
    private int nr;

    public RabbitRunnable(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit " + this.nr + " is running");
    }
}
