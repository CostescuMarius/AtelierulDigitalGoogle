package collection.hashmap;

public class Student {
    private String CNP;
    private String name;

    public Student(String CNP, String name) throws CNPSizeException {
        if(CNP.length() != 10) {
            throw new CNPSizeException();
        }
        this.CNP = CNP;
        this.name = name;
    }

    public String getCNP() {
        return CNP;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "CNP='" + CNP + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class CNPSizeException extends Exception{
        public CNPSizeException() {
            super("CNP size must be 10 ");
        }
    }
}


