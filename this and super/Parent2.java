// Parent class
class Parent2 {
    String name = "Parent";

    // Method in the parent class
    public void show() {
        System.out.println("Parent class method: " + name);
    }
}

// Child class
class Child extends Parent2 {
    String name = "Child";

    // Method in the child class
    public void show() {
        // Calling the parent class's show() method using super()
        super.show();  // This calls the show() method from Parent class
        System.out.println("Child class method: " + this.name); // Accessing the instance variable from Child using this
    }

    // Method to call current class object using this()
    public void printCurrentObject() {
        // Here, this refers to the current object of the class
        System.out.println("Current object: " + this);  // This will print the reference to the current object
    }

    public static void main(String[] args) {
        Child child = new Child();
        
        // Calling methods
        child.show();  // Calls show() from both Parent and Child class
        child.printCurrentObject();  // Calls the method to print the current object reference
    }
}

