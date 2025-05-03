import java.util.Arrays;

public class RemoveDuplicates {
    
    // Method to remove duplicates from an array
    public static int[] removeDuplicates(int[] arr) {
        // Sort the array to bring duplicates together
        Arrays.sort(arr);

        // Create a new array to store unique elements
        int[] result = new int[arr.length];
        int index = 0;

        // Loop through the original array
        for (int i = 0; i < arr.length; i++) {
            // For the first element or when it's different from the previous one
            if (i == 0 || arr[i] != arr[i - 1]) {
                result[index++] = arr[i];
            }
        }

        // Return the result array with unique elements
        return Arrays.copyOf(result, index); // Copy only the relevant part of the array
    }

    public static void main(String[] args) {
        // Original array with duplicates
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // Call the removeDuplicates method
        int[] result = removeDuplicates(arr);

        // Print the result
        System.out.println(Arrays.toString(result));
    }
}
