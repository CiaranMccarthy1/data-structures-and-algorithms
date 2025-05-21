import java.util.*;

public class LinearSearch {
    public static void main(String args[]) {

        int length;
        int target;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Start of program");

        System.out.println("Enter length of array:");
        length = userInput.nextInt();

        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        System.out.println("Enter target value to search for:");
        target = userInput.nextInt();

        int result = Search(numbers, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found after " + result + " attempts");
        }

    }

    public static int Search(int[] arr, int target) {
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

