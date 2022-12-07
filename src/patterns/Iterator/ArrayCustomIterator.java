package patterns.Iterator;

public class ArrayCustomIterator implements Iterator{
    private int[] arr = new int[3];
    private int index;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < arr.length){
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {

        if(this.hasNext()){
            return arr[index++];
        }
        return null;
    }
}
