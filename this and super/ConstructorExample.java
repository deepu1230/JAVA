public class ConstructorExample {

    // Constructor with no arguments
    public ConstructorExample() {
        System.out.println("No-argument constructor called");
    }

    // Constructor with one argument
    public ConstructorExample(String name) {
        // Call the no-argument constructor
        this();  // This calls the constructor ConstructorExample()
        System.out.println("Constructor with String argument called: " + name);
    }

    // Constructor with two arguments
    public ConstructorExample(String name, int age) {
        // Call the constructor with one argument
        this(name);  // This calls the constructor ConstructorExample(String name)
        System.out.println("Constructor with String and int arguments called: " + name + ", " + age);
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        ConstructorExample obj1 = new ConstructorExample();  // Calls no-argument constructor
        ConstructorExample obj2 = new ConstructorExample("John");  // Calls constructor with String argument
        ConstructorExample obj3 = new ConstructorExample("John", 25);  // Calls constructor with String and int arguments
    }
}

