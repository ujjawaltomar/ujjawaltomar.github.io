
 import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana"); // Duplicate element

        // Display HashSet
        System.out.println("HashSet contents:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        System.out.println("\nContains Mango? " + fruits.contains("Mango"));


        fruits.remove("Orange");
        System.out.println("\nAfter removing Orange: " + fruits);

        // Size of HashSet
        System.out.println("Size of HashSet: " + fruits.size());

        // Clear all elements
        fruits.clear();
        System.out.println("Is HashSet empty? " + fruits.isEmpty());
    }
}

