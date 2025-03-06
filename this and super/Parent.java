// Parent class (Superclass)
class Parent {
    // Instance fields of the Parent class
    protected String name = "John";
    protected int age = 45;
    
    // Constructor of the Parent class
    public Parent() {
        System.out.println("Parent class constructor called.");
    }
}

// Child class (Subclass) that extends Parent
class Child extends Parent {
    
    // Method in the Child class to print Parent class fields using 'super'
    public void printParentFields() {
        // Accessing Parent class fields using 'super'
        System.out.println("Name from Parent class: " + super.name);
        System.out.println("Age from Parent class: " + super.age);
    }

    public static void main(String[] args) {
        // Creating an object of the Child class
        Child child = new Child();
        
        // Calling the method to print Parent class fields using 'super'
        child.printParentFields();
    }
}

