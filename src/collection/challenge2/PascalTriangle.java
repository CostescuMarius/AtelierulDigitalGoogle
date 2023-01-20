package collection.challenge2;

public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 0; i < rows; i++) {
            int nr = 1;
            System.out.format("%" + (rows-i) * 2 + "s", "");
            for(int j = 0; j <= i; j++) {
                System.out.format("%4d", nr);
                nr = nr * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}