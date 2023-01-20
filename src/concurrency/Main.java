package concurrency;

public class Main {
    public static int v = 0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("before v = " + v);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                v++;
            }
        };

        for(int i = 0; i <= 1000; i++) {
            (new Thread(runnable)).start();
        }
        Thread.sleep(100);
        System.out.println("after v = " + v);
    }
}
