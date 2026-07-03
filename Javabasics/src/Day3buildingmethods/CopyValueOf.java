package Day3buildingmethods;

public class CopyValueOf {

	public static void main(String[] args) {

		char[] letters = {'J', 'A', 'V', 'A'};

		String word = String.copyValueOf(letters);

		System.out.println(word);

	}

}