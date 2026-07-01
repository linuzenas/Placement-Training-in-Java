package Day1;

public class Operators {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\na > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\nAND (&&): " + (x && y));
        System.out.println("OR (||): " + (x || y));
        System.out.println("NOT (!): " + (!x));

        // Assignment Operators
        int num = 5;

        num += 3;
        System.out.println("\nAfter += : " + num);

        num *= 2;
        System.out.println("After *= : " + num);

        // Increment and Decrement
        int count = 10;

        count++;
        System.out.println("\nAfter ++ : " + count);

        count--;
        System.out.println("After -- : " + count);
    }
}