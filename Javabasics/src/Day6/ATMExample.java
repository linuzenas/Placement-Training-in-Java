package Day6;

import java.util.Scanner;

// Parent Class
class BankAccount {

    protected String accountHolder = "Linu";
    protected int accountNumber = 123456;
    protected double balance = 10000;

    public void showDetails() {

        System.out.println("\n----- Account Details -----");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);

    }

}

// Child Class
class ATM extends BankAccount {

    public void deposit(double amount) {

        balance += amount;
        System.out.println("₹" + amount + " Deposited Successfully.");

    }

    public void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;
            System.out.println("₹" + amount + " Withdrawn Successfully.");

        } else {

            System.out.println("Insufficient Balance.");

        }

    }

    public void checkBalance() {

        System.out.println("Available Balance : ₹" + balance);

    }

}

// Main Class
public class ATMExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM();

        int choice;

        do {

            System.out.println("\n====== ZENAS ATM MENU ======");
            System.out.println("1. Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                atm.showDetails();
                break;

            case 2:

                System.out.print("Enter Deposit Amount : ₹");
                double deposit = sc.nextDouble();

                atm.deposit(deposit);
                break;

            case 3:

                System.out.print("Enter Withdraw Amount : ₹");
                double withdraw = sc.nextDouble();

                atm.withdraw(withdraw);
                break;

            case 4:

                atm.checkBalance();
                break;

            case 5:

                System.out.println("Thank You for Using ZENAS ATM.");
                break;

            default:

                System.out.println("Invalid Choice.");

            }

        } while (choice != 5);

        sc.close();

    }

}