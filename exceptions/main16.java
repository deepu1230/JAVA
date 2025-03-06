public class main16 {
    public static void main(String[] args) {
        String str = "abc"; // A string that is not a valid number

        // This will cause a NumberFormatException because "abc" is not a valid number
        int number = Integer.parseInt(str);

        System.out.println("The number is: " + number);
    }
}

