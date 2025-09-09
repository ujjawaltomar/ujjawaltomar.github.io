
import java.util.Arrays;

public class SeprateZeros {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 0, 7, 1, 0};

        int[] result = new int[arr.length];
        int index = 0;

        // Add all non-zero elements to result
        for (int num : arr) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        // Remaining elements are already 0 (default in int[])
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Separated Array: " + Arrays.toString(result));
    }
}

