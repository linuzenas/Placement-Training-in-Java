package Day1;

public class Variables {

    public static void main(String[] args) {

        // Declaring variables
        String name = "Linu";
        int age = 21;
        double cgpa = 8.75;
        char grade = 'A';
        boolean placed = false;

        // Printing variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
        System.out.println("Placed: " + placed);

        // Changing variable value
        age = 22;

        System.out.println("\nAfter updating age:");
        System.out.println("Age: " + age);
    }
}