// Class with a method that throws an exception
class MyClass {

    // Method that throws an exception
    public static void throwException() throws Exception {
        // This will throw an exception
        throw new Exception("This is a custom exception");
    }
}

// Main class to run the program
public class main3 {
    public static void main(String[] args) throws Exception {
        // Calling the method that throws an exception
        MyClass.throwException();

        System.out.println("This line will not be executed if exception is thrown.");
    }
}

