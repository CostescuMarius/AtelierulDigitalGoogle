package generics.challenge4;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
        ArrayIterator<Integer> iterator = new ArrayIterator<>(intArray);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}