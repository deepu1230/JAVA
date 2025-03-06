public class static6 {  

    
    public static int staticVariable1 = 10;  
    public static String staticVariable2 = "Hello, Static!";  

    
    public int instanceVariable1;  
    public String instanceVariable2;  

    public static6(int instanceVariable1, String instanceVariable2) {  
        this.instanceVariable1 = instanceVariable1;  
        this.instanceVariable2 = instanceVariable2;  
    }  

    public static void main(String[] args) {  
          
        System.out.println("Static Variable 1: " + static6.staticVariable1);  
        System.out.println("Static Variable 2: " + static6.staticVariable2);  

        
        static6 obj1 = new static6(20, "Instance 1");  
        static6 obj2 = new static6(30, "Instance 2");  

    
        System.out.println("\nInstance Variables for obj1:");  
        System.out.println("Instance Variable 1: " + obj1.instanceVariable1);  
        System.out.println("Instance Variable 2: " + obj1.instanceVariable2);  

    
        System.out.println("\nInstance Variables for obj2:");  
        System.out.println("Instance Variable 1: " + obj2.instanceVariable1);  
        System.out.println("Instance Variable 2: " + obj2.instanceVariable2);  

    
        static6.staticVariable1 = 100;  
        static6.staticVariable2 = "Modified Static!";  

        System.out.println("\nAfter Modification:");  
        System.out.println("Static Variable 1: " + static6.staticVariable1);  
        System.out.println("Static Variable 2: " + static6.staticVariable2);  

        System.out.println("\nInstance Variables for obj1 (after static modification):");  
        System.out.println("Instance Variable 1: " + obj1.instanceVariable1);  
        System.out.println("Instance Variable 2: " + obj1.instanceVariable2);  

        System.out.println("\nInstance Variables for obj2 (after static modification):");  
        System.out.println("Instance Variable 1: " + obj2.instanceVariable1);  
        System.out.println("Instance Variable 2: " + obj2.instanceVariable2);  
    }  
}
