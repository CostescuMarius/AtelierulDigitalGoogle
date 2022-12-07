package exceptions;

public class Main {
    public int test(int i) {
        try {
            System.out.println("Try ");
            if(i > 2)
                throw new ClassCastException();
            System.out.println("Try ");
            return 0;
        } catch(Exception e) {
            System.out.println("catch ");
            return 1;
        } finally {
            System.out.println("finally ");
            return 2;
        }
    }
    public static void main(String args[]) {
        System.out.println((new Main()).test(5));
    }
}
