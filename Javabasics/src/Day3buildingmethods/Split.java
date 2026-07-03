package Day3buildingmethods;

public class Split {

		public static void main(String[] args) {

			String fruits = "Apple,Mango,Banana,Orange";

			String[] array = fruits.split(",");

			for (String fruit : array) {

				System.out.println(fruit);

			}

		}

}
