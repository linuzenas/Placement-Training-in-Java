package Day4;
import java.util.Scanner;
public class AutomorphicNumber {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter a number: ");
			int number = sc.nextInt();

			int square = number * number;

			String num = String.valueOf(number);
			String sq = String.valueOf(square);

			if (sq.endsWith(num)) {
				System.out.println(number + " is an Automorphic Number.");
			} else {
				System.out.println(number + " is NOT an Automorphic Number.");
			}

			sc.close();
		}
}
