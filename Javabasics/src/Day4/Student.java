package Day4;

public class Student {

    int id;
    String name;

    Student() {

        id = 101;
        name = "Linu";

    }

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("ID : " + s.id);
        System.out.println("Name : " + s.name);

    }

}