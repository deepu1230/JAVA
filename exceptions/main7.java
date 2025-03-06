import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main7{
    
    public static void readFile(String fileName) {
        BufferedReader reader = null;
        try {
            // Create a BufferedReader to read from the specified file
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            // Read and print each line from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle the IOException if the file cannot be read
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            // This block will be executed regardless of an exception occurring or not
            try {
                if (reader != null) {
                    reader.close(); // Close the BufferedReader
                    System.out.println("BufferedReader closed.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the BufferedReader: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Specify the file name to read
        String fileName = "example.txt";
        readFile(fileName);
        
        System.out.println("Program completed.");
    }
}
