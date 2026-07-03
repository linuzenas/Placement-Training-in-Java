package Day3buildingmethods;

public class ValueOf {
		public static void main(String[] args) {

			int number = 100;
			double marks = 89.5;
			boolean result = true;

			String num = String.valueOf(number);
			String score = String.valueOf(marks);
			String status = String.valueOf(result);

			System.out.println(num);
			System.out.println(score);
			System.out.println(status);

		}
}
