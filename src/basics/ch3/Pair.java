package basics.ch3;

public class Pair {
    private int value1;
    private int value2;

    public Pair(int v1, int v2){
        value1 = v1;
        value2 = v2;
    }

    /*=*@Override
    /*public boolean equals(Object o)
    {
        if(this == o) return true;
        //if(o == null)
    }*/

    @Override
    public String toString() {
        return "[" + value1 + "," + value2 + "]";
    }
}
