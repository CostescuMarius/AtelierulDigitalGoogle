package generics.challenge4;

import java.util.NoSuchElementException;

class ArrayIterator<T> implements IArrayIterator<T> {
    private T[] array;
    private int index = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    public boolean hasNext() {
        return index < array.length;
    }

    public T next() {
        if (hasNext()) {
            return array[index++];
        }
        throw new NoSuchElementException();
    }
}