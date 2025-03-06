// Parent class
class Parent1{
    // No-argument constructor
    public Parent1() {
        System.out.println("Parent class constructor called.");
    }
}

// Child class
class Child extends Parent1 {
    public Child() {
        // Calling the no-argument constructor of the parent class
        super();
        System.out.println("Child class constructor called.");
    }

    public static void main(String[] args) {
        // Creating an object of the Child class
        Child obj = new Child();
    }
}

