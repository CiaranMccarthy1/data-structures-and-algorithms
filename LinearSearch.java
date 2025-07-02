/*
Linear search 
Big O notation of O(n)
*/

public class LinearSearch {
    public static void main(String args[]) {
        System.out.println("Start of program");

        int[] numbers = ArrayInitializer.initializeArray();
        ArrayInitializer.displayArray(numbers);

        int target = ArrayInitializer.getTargetInput();

        int result = linearSearch(numbers, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found after " + result + " attempts");
        }
    }

    // Checks every element until target is found
    public static int linearSearch(int[] arr, int target) {
        int tries = 0;
        for (int i = 0; i < arr.length; i++) {
            tries += 1;
            if (arr[i] == target) {
                return tries;
            }
        }
        return -1;
    }
}

