public class main4{
    
    public static void main(String[] args) {
        String[] inputs = {"10", "abc", null, "20.5"};

        for (String input : inputs) {
            try {
                // Try to parse the input as an integer
                int number = Integer.parseInt(input);
                System.out.println("Parsed integer: " + number);
            } catch (NumberFormatException e) {
                // This block will handle non-integer strings
                System.out.println("NumberFormatException: Unable to parse '" + input + "' as an integer.");
            } catch (NullPointerException e) {
                // This block will handle null inputs
                System.out.println("NullPointerException: Input is null.");
            } catch (Exception e) {
                // Catch any other exception
                System.out.println("Exception: An error occurred: " + e.getMessage());
            }
        }
        
        System.out.println("Program completed.");
    }
}

