class MyClass {  
    private int x;  

    
    private MyClass() {  
        this.x = 0;  
        System.out.println("Private constructor called");  
    }  

     
    MyClass(int x) {  
        this.x = x;  
        System.out.println("Default (package-private) constructor called with x = " + x);  
    }  

    
    protected MyClass(int x, String message) {  
        this.x = x;  
        System.out.println("Protected constructor called with x = " + x + " and message = " + message);  
    }  

     
    public MyClass(int x, String message, boolean flag) {  
        this.x = x;  
        System.out.println("Public constructor called with x = " + x + ", message = " + message + ", and flag = " + flag);  
    }  

    public int getX() {  
        return x;  
    }  

    public static void main(String[] args) {  
        
        MyClass obj1 = MyClass.createMyClass();  
        System.out.println("obj1.x = " + obj1.getX());  

         
        MyClass obj2 = new MyClass(10);  
        System.out.println("obj2.x = " + obj2.getX());  

        
        MyClass obj3 = new MyClass(20, "Protected message");  
        System.out.println("obj3.x = " + obj3.getX());  

        
        MyClass obj4 = new MyClass(30, "Public message", true);  
        System.out.println("obj4.x = " + obj4.getX());  
    }  

    
    private static MyClass createMyClass() {  
        return new MyClass();  
    }  
}  


class AnotherClass {  
    public static void main(String[] args) {  
         
        MyClass obj1 = new MyClass(5);  
        System.out.println("obj1.x from AnotherClass = " + obj1.getX());  

         
        MyClass obj2 = new MyClass(15, "Another protected message");  
        System.out.println("obj2.x from AnotherClass = " + obj2.getX());  

        
        MyClass obj3 = new MyClass(25, "Another public message", false);  
        System.out.println("obj3.x from AnotherClass = " + obj3.getX());  
    }  
}  


