import java.util.HashMap;
import java.util.Map;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3, 3, 3};


        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {

            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }


        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
          }
    }
}

