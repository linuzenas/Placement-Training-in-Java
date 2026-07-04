package Day4;
import java.util.Scanner;
public class NeonNumber {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter a number: ");
			int number = sc.nextInt();

			int square = number * number;
			int temp = square;
			int sum = 0;

			while (temp > 0) {

				int digit = temp % 10;

				sum = sum + digit;

				temp = temp / 10;

			}

			System.out.println("Square = " + square);
			System.out.println("Sum of digits = " + sum);

			if (sum == number) {

				System.out.println(number + " is a Neon Number.");

			} else {

				System.out.println(number + " is NOT a Neon Number.");

			}

			sc.close();
		}
}
