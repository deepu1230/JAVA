// Step 1: Create a custom exception class
class InvalidAgeException extends Exception {
    // Constructor
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Step 2: Create a class to test the custom exception
public class main6 {

    // Method that checks if the age is valid
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be between 0 and 150.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        int[] testAges = {25, -5, 200, 30};

        for (int age : testAges) {
            try {
                checkAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
        }
        
        System.out.println("Program completed.");
    }
}
