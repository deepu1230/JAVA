class Myclass {  
    final int x;  
    final String message;  

     
    public Myclass() {  
        this.x = 0;  
        this.message = "Default message";  
        System.out.println("Default constructor called.");  
    }  

   
    public Myclass(int x) {  
        this.x = x;  
        this.message = "Message with x = " + x;  
        System.out.println("One-argument constructor called with x = " + x);  
    }  

    
    public Myclass(int x, String message) {  
        this.x = x;  
        this.message = message;  
        System.out.println("Two-argument constructor called with x = " + x + " and message = " + message);  
    }  

    
    public int getX() {  
        return x;  
    }  

    public String getMessage() {  
        return message;  
    }  
}  

public class main1{  
    public static void main(String[] args) {  
       
        Myclass obj1 = new Myclass();  
        System.out.println("Object 1: x = " + obj1.getX() + ", message = " + obj1.getMessage());  
        System.out.println();  

       
        Myclass obj2 = new Myclass(10);  
        System.out.println("Object 2: x = " + obj2.getX() + ", message = " + obj2.getMessage());  
        System.out.println();  

        
        Myclass obj3 = new Myclass(20, "Hello, world!");  
        System.out.println("Object 3: x = " + obj3.getX() + ", message = " + obj3.getMessage());  
        System.out.println();  
    }  
}