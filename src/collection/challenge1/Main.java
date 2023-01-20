package collection.challenge1;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        List list2 = new ArrayList<>();
        int ct = 0;
        boolean leader = false;
        //List list={2, 5 , 7 , 1 , 2 ,1};
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(1);
        list2 = List.copyOf(list);
        Iterator<Integer> it = list.iterator();
        Iterator<Integer> it2 = list2.iterator();
        Integer currInt;

        while (it.hasNext()) {
            currInt = it.next();
            leader = true;
            //list2.remove(0);
            while (it2.hasNext()) {
                if (currInt < it2.next()) {
                    leader = false;
                }
            }
            if(leader==true)
            {
                System.out.println(currInt);
            }
        }
    }
}
