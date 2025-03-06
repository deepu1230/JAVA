public class main2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            // This will cause an ArithmeticException because division by zero is not allowed
            int result = num1 / num2;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            // This block will catch the ArithmeticException and print a message
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program execution continues...");
    }
}
