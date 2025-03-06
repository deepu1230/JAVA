public class printfields {

    // Instance variables (fields)
    final String name = "John";
    final int age = 25;
    
    // Method to print instance fields using 'this'
    public void printFields() {
        // Accessing instance variables using 'this'
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        printfields obj = new printfields();
        
        // Calling the method to print the fields using 'this'
        obj.printFields();
    }
}
