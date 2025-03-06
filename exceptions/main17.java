public class main17 {
    public static void main(String[] args) {
        // Create a sample string
        String sampleText = "Hello, World!";

        try {
            // Attempt to access an index that is out of bounds
            // For instance, accessing index 20 in a string of length 13
            char character = sampleText.charAt(20);
            System.out.println("Character at index 20: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the exception and print a message
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // Inform the user that the program has completed
        System.out.println("Program completed.");
    }
}
