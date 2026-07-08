package Day7;

import java.util.Scanner;

// Parent Class
class Calculator {

    void calculate(int a, int b) {
        System.out.println("Calculation");
    }

}

// Child Class - Addition
class Addition extends Calculator {

    @Override
    void calculate(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

}

// Child Class - Subtraction
class Subtraction extends Calculator {

    @Override
    void calculate(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

}

// Child Class - Multiplication
class Multiplication extends Calculator {

    @Override
    void calculate(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

}

// Child Class - Division
class Division extends Calculator {

    @Override
    void calculate(int a, int b) {

        if (b != 0) {
            System.out.println("Division = " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }

    }

}

// Main Class
public class PolymorphismCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("\nEnter Your Choice : ");
        int choice = sc.nextInt();

        Calculator obj;

        switch (choice) {

            case 1:
                obj = new Addition();
                break;

            case 2:
                obj = new Subtraction();
                break;

            case 3:
                obj = new Multiplication();
                break;

            case 4:
                obj = new Division();
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;

        }

        obj.calculate(a, b);

        sc.close();
    }

}