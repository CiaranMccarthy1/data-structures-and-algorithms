/*
Binary search 
Big O notation of O(log N)
*/


public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Start of program");

        int[] numbers = ArrayInitializer.initializeArray();
        ArrayInitializer.displayArray(numbers);

        int target = ArrayInitializer.getTargetInput();

        int result = binarySearch(numbers, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found after " + result + " attempts");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int tries = 0;
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            tries += 1;

            if (array[mid] == target) {
                return tries;
            }

            if (array[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        
        return -1;
    }
}