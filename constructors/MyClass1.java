public class MyClass1{

    // Constructor - No return type, used for initializing objects
    public MyClass1() {
        System.out.println("Constructor called!");
    }

    // Method returning an int
    public int getNumber() {
        return 42; // Example number
    }

    // Method returning a String
    public String getGreeting() {
        return "Hello, world!"; // Example string
    }

    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass1 obj= new MyClass1();

        // Call methods that return int and String
        System.out.println("Number: " + obj.getNumber());
        System.out.println("Greeting: " + obj.getGreeting());
    }
}


