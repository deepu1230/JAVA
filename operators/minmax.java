public class minmax {  

    public static void main(String[] args) {  
        int num1 = 25;  
        int num2 = 10;  

        System.out.println("num1 = " + num1);  
        System.out.println("num2 = " + num2);  

         
        int smaller = Math.min(num1, num2);  

         
        int larger = Math.max(num1, num2);  

        System.out.println("Smaller number: " + smaller);  
        System.out.println("Larger number: " + larger);  

    
    }  
}