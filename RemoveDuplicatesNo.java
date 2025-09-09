import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesNo {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 4, 9, 1, 5, 7};

        // Use LinkedHashSet to maintain insertion order and remove duplicates
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Convert Set back to array
        int[] uniqueArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArr[index++] = num;
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
    }
}

