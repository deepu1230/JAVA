public class main9 {
    public static void main(String[] args) {
        // Create an array with 5 elements
        int[] numbers = {0, 1, 2, 3, 4};

        try {
            // Attempt to access an invalid index (e.g., index 5)
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the exception and print a message
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // Inform the user that the program has completed
        System.out.println("Program completed.");
    }
}
