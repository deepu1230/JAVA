public class MyClass2{

    private int number;
    private String message;

    // Constructor - Initializes the object
    public MyClass2() {
        this.number = 0;
        this.message = "Initial message";
        System.out.println("Constructor called!");
    }

    // Method to reset the object (simulating multiple constructor calls)
    public void reinitialize() {
        this.number = 0;
        this.message = "Reinitialized message";
        System.out.println("Reinitializing object...");
    }

    // Method to display object details
    public void display() {
        System.out.println("Number: " + number + ", Message: " + message);
    }

    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass2 obj= new MyClass2();
        obj.display(); // Display the initial values

        // Simulate calling the constructor again by using reinitialize method
        obj.reinitialize(); // Reinitialize object state
        obj.display(); // Display the reinitialized values

        // Call reinitialize again to simulate calling the constructor a second time
        obj.reinitialize();
        obj.display(); // Display the updated values
    }
}

