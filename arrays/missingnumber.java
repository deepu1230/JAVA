public class missingnumber {  

    public static int findMissingNumber(int[] arr) {  
        if (arr == null || arr.length != 99) {  
            throw new IllegalArgumentException("Array must contain 99 elements and not be null.");  
        }  

        int expectedSum = (100 * (100 + 1)) / 2; // Sum of numbers from 1 to 100  
        int actualSum = 0;  

        for (int num : arr) {  
            actualSum += num;  
        }  

        return expectedSum - actualSum;  
    }  

    public static void main(String[] args) {  
        // Example usage:  
        int[] numbers = new int[99];  
        int missingNumber = 42; // Example missing number  
        int index = 0;  
        for (int i = 1; i <= 100; i++) {  
            if (i != missingNumber) {  
                numbers[index++] = i;  
            }  
        }  

        int missing = findMissingNumber(numbers);  
        System.out.println("The missing number is: " + missing); // Output: The missing number is: 42  

        // Another example with a different missing number:  
        missingNumber = 7;  
        index = 0;  
        int[] numbers2 = new int[99]; // Need to create a new array  
        for (int i = 1; i <= 100; i++) {  
            if (i != missingNumber) {  
                numbers2[index++] = i;  
            }  
        }  
        missing = findMissingNumber(numbers2);  
        System.out.println("The missing number is: " + missing); // Output: The missing number is: 7  


        //Example to show IllegalArgumentException  
        int[] shortArray = new int[50];  
        try {  
            missing = findMissingNumber(shortArray);  
        } catch (IllegalArgumentException e) {  
            System.out.println("Caught exception: " + e.getMessage());  
        }  

        int[] longArray = new int[100];  
        try {  
            missing = findMissingNumber(longArray);  
        } catch (IllegalArgumentException e) {  
            System.out.println("Caught exception: " + e.getMessage());  
        }  

        int[] nullArray = null;  
        try {  
            missing = findMissingNumber(nullArray);  
        } catch (IllegalArgumentException e) {  
            System.out.println("Caught exception: " + e.getMessage());  
        }  


    }  
}  
