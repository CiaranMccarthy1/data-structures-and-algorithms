
import java.util.*;

public class ArrayInitializer {
    final private static Scanner userInput = new Scanner(System.in);

    // Initializes an array 
    public static  int[] initializeArray() {
        System.out.println("Enter length of array:");
        int length = userInput.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
        }
        return array;
    }

    // Initializes a random array
    public static  int[] initializeRandomArray() {
        System.out.println("Enter length of array:");
        int length = userInput.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int)(Math.random() * 101);
        }
        return array;
    }

    // Gets the target value from user input
    public static int getTargetInput() {
        System.out.println("Enter target value to search for:");
        return userInput.nextInt();
    }
    
    public static  void displayArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
