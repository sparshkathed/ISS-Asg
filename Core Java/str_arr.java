// 1.4 Strings, Arrays

public class str_arr {
    public static void main(String[] args) {
        // String manipulation
        String quote = "Hello, World!";

        // Length of the string
        int length = quote.length();
        System.out.println("Length of the string: " + length);

        // Concatenation
        String name = "Alice";
        String msg = quote + " My name is " + name;
        System.out.println("Concatenated String: " + msg);

        // Substring
        String substring = quote.substring(0, 5);
        System.out.println("Substring: " + substring);

        // Uppercase and lowercase
        String uppercase = quote.toUpperCase();
        String lowercase = quote.toLowerCase();
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);

        // Array example
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements
        System.out.println("Element at index 2: " + numbers[2]);

        // Modifying elements
        numbers[3] = 10;
        System.out.println("Modified element at index 3: " + numbers[3]);

        // Length of the array
        int arrayLength = numbers.length;
        System.out.println("Length of the array: " + arrayLength);

        // Looping through the array
        System.out.println("Array elements:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
