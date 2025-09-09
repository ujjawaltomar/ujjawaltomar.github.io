
import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

        // Selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // Find the index of the smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element of unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Output sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

