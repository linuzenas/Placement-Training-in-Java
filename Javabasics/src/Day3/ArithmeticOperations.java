package Day3;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public static void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    public static void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    public static void divide(int a, int b) {

        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Cannot divide by zero");

    }

    public static void modulus(int a, int b) {

        if (b != 0)
            System.out.println("Modulus = " + (a % b));
        else
            System.out.println("Cannot perform modulus by zero");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        add(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
        modulus(a, b);

        sc.close();
    }
}