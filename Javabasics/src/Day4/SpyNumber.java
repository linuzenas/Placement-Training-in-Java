package Day4;
import java.util.Scanner;
public class SpyNumber {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter a number: ");
			int number = sc.nextInt();

			int temp = number;
			int sum = 0;
			int product = 1;

			while (temp > 0) {

				int digit = temp % 10;

				sum = sum + digit;
				product = product * digit;

				temp = temp / 10;

			}

			System.out.println("Sum of digits = " + sum);
			System.out.println("Product of digits = " + product);

			if (sum == product) {
				System.out.println(number + " is a Spy Number.");
			} else {
				System.out.println(number + " is NOT a Spy Number.");
			}

			sc.close();
		}
}
