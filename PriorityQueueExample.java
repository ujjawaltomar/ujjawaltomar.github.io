
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers (min-heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        // Print elements in order of priority
        System.out.println("PriorityQueue elements (Min-Heap):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

