// Custom exception class
class MyCustomException extends Exception {
    // Constructor to pass the custom message to the Exception class
    public MyCustomException(String message) {
        super(message);
    }
}

// Class to demonstrate throwing custom exception
class MyClass {

    // Method that throws a custom exception
    public static void throwCustomException() throws MyCustomException {
        throw new MyCustomException("This is a custom exception with a custom message!");
    }
}

// Main class to run the program
public class main5 {
    public static void main(String[] args) {
        try {
            // Calling the method that throws a custom exception
            MyClass.throwCustomException();
        } catch (MyCustomException e) {
            // Catch the custom exception and print the custom message
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
