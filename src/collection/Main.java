package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List getList() {
        List list = new LinkedList();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Empty");
        list.add("Something");
        System.out.println(list);

        return list;
    }

    public static void main(String[] args) {
        List a = getList();

        Iterator<String> it = a.iterator();
        String currentString;
        while(it.hasNext()){
            currentString = it.next();
            if(currentString == "Third") {
                it.remove();
                it.remove();
            }
        }

        System.out.println(a);
    }
}
