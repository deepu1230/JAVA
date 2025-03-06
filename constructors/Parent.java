class Parent {  
    private String name;  

    // Default constructor  
    public Parent() {  
        System.out.println("Parent default constructor called");  
        this.name = "Default Parent";  
    }  

    // Argument constructor  
    public Parent(String name) {  
        System.out.println("Parent argument constructor called with name: " + name);  
        this.name = name;  
    }  

    public String getName() {  
        return name;  
    }  
}  

class Child extends Parent {  
    final int age;  

    // Child default constructor  
    public Child() {  
        super(); // Calls Parent's default constructor  
        System.out.println("Child default constructor called");  
        this.age = 0;  
    }  

    // Child argument constructor 1  
    public Child(String name) {  
        super(name); // Calls Parent's argument constructor  
        System.out.println("Child argument constructor called with name: " + name);  
        this.age = 0;  
    }  

    // Child argument constructor 2  
    public Child(String name, int age) {  
        super(name); // Calls Parent's argument constructor  
        System.out.println("Child argument constructor called with name: " + name + " and age: " + age);  
        this.age = age;  
    }  

    public static void main(String[] args) {  
        Child child1 = new Child();           // Calls Parent's default constructor, then Child's default  
        System.out.println("Child 1 name: " + child1.getName());  
        System.out.println();  

        Child child2 = new Child("ChildName");  // Calls Parent's argument constructor, then Child's  
        System.out.println("Child 2 name: " + child2.getName());  
        System.out.println();  

        Child child3 = new Child("AnotherChild", 10); // Calls Parent's argument constructor, then Child's  
        System.out.println("Child 3 name: " + child3.getName());  
    }  
}
