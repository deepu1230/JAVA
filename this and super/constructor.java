public class constructor {

    // Argument constructor with one parameter (String)
    public constructor(String name) {
        System.out.println("Constructor with String argument called: " + name);
    }

    // Argument constructor with two parameters (String, int)
    public constructor(String name, int age) {
        // Call the constructor with one argument (String)
        this(name);  // This calls ConstructorExample(String name)
        System.out.println("Constructor with String and int arguments called: " + name + ", " + age);
    }

    // Argument constructor with three parameters (String, int, boolean)
    public constructor(String name, int age, boolean isEmployed) {
        // Call the constructor with two arguments (String, int)
        this(name, age);  // This calls ConstructorExample(String name, int age)
        System.out.println("Constructor with String, int, and boolean arguments called: " + name + ", " + age + ", " + isEmployed);
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        ConstructorExample obj1 = new ConstructorExample("Alice");
        ConstructorExample obj2 = new ConstructorExample("Bob", 30);
        constructor obj3 = new constructor("Charlie", 40, true);
    }
}

