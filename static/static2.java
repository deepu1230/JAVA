public class static2{  

    // Instance variables  
    int instanceVariable1;  
    String instanceVariable2;  

    // Constructor  
    public static2(int instanceVariable1, String instanceVariable2) {  
        this.instanceVariable1 = instanceVariable1;  
        this.instanceVariable2 = instanceVariable2;  
    }  

    // Static method that takes an object of the class as an argument  
    public static void printInstanceVariables(static2 obj) {  
        if (obj != null) { // Important: Check for null!  
            System.out.println("Instance Variable 1: " + obj.instanceVariable1);  
            System.out.println("Instance Variable 2: " + obj.instanceVariable2);  
        } else {  
            System.out.println("Object is null. Cannot print instance variables.");  
        }  
    }  

    public static void main(String[] args) {  
        // Create instances of the class  
        static2 obj1 = new static2(5, "Instance 1");  
        static2 obj2 = new static2(15, "Instance 2");  

        // Call the static method, passing in the objects  
        static2.printInstanceVariables(obj1);  
        static2.printInstanceVariables(obj2);  

        static2.printInstanceVariables(null); // Demonstrate null handling  
    }  
}  
