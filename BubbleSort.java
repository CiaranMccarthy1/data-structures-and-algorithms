
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Start of program");

        int[] numbers = ArrayInitializer.initializeRandomArray();
        ArrayInitializer.displayArray(numbers);

        // Bubble sort implementation (optional)
        bubbleSort(numbers);
        System.out.println("Sorted array:");
        ArrayInitializer.displayArray(numbers);
    }

    public static void bubbleSort(int[] arr) {
        System.out.println("Hello wolrd");
    }
}