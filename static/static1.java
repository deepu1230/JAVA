public class static1 {  

    // Instance variables (attributes)  
    String name;  
    String breed;  
    int age;  

    // Constructor  
    public static1(String name, String breed, int age) {  
        this.name = name;  
        this.breed = breed;  
        this.age = age;  
    }  

    // Instance methods (behaviors)  
    public void bark() {  
        System.out.println(name + " says: Woof!");  
    }  

    public String fetch(String item) {  
        return name + " fetched the " + item + "!";  
    }  

    public int getAgeInDogYears() {  
        return age * 7; // Simple dog years calculation  
    }  

    public static void main(String[] args) {  
        // Create Dog objects (instances of the Dog class)  
        static1 dog1 = new static1("Buddy", "Golden Retriever", 3);  
        static1 dog2 = new static1("Lucy", "Poodle", 5);  

        // Call the methods on the Dog objects  
        dog1.bark(); // Output: Buddy says: Woof!  
        System.out.println(dog1.fetch("ball")); // Output: Buddy fetched the ball!  
        System.out.println(dog1.name + " is " + dog1.getAgeInDogYears() + " dog years old."); //Output: Buddy is 21 dog years old.  

        dog2.bark(); // Output: Lucy says: Woof!  
        System.out.println(dog2.fetch("stick")); // Output: Lucy fetched the stick!  
        System.out.println(dog2.name + " is " + dog2.getAgeInDogYears() + " dog years old."); //Output: Lucy is 35 dog years old.  
    }  
}  