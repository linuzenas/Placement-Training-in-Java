package Day4;
import java.util.Scanner;
public class DuckNumber {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter a number: ");
			String number = sc.next();

			if (number.charAt(0) == '0') {

				System.out.println("Not a Duck Number");

			} else if (number.contains("0")) {

				System.out.println("Duck Number");

			} else {

				System.out.println("Not a Duck Number");

			}

			sc.close();
		}
}
