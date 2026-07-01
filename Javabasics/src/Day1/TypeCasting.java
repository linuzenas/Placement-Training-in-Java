package Day1;

public class TypeCasting {

    public static void main(String[] args) {

        // Implicit Casting (Small → Large)
        int number = 100;
        double decimal = number;

        System.out.println("Integer value: " + number);
        System.out.println("Converted to double: " + decimal);

        // Explicit Casting (Large → Small)
        double price = 299.99;
        int roundedPrice = (int) price;

        System.out.println("\nOriginal double: " + price);
        System.out.println("Converted to int: " + roundedPrice);

        // Character to Integer
        char letter = 'A';
        int ascii = letter;

        System.out.println("\nCharacter: " + letter);
        System.out.println("ASCII Value: " + ascii);
    }
}