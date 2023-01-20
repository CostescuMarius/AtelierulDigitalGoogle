package generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void stringsExample() {
        List<String> strings = new ArrayList<String>();
        List str = strings;
        str.add(LocalDate.now());
        strings.add("Hello");
        strings.add(LocalDate.now().toString());

        for(String o : strings) {
            String s = o;
            System.out.println(s + " " + s.length());
        }
    }

    public static void main(String[] args) {
        stringsExample();
    }
}
