package collection.hashmap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Student.CNPSizeException {
        List students = new ArrayList<Student>();
        students.add(new Student("1234567890", "And Maria"));
        students.add(new Student("1234565453", "And Maria2"));
        students.add(new Student("1234563555", "And Maria3"));
        students.add(new Student("1234565785", "And Maria4"));

        StudentDatabase sd = new StudentDatabase(students);

        String name = sd.findStudentName("1234567890");
        System.out.println(name);

        String name1 = sd.findStudentName("3423467890");
        System.out.println(name1);
    }
}
