import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("pen");
        list.add("good");
        list.add("black");
        list.add("Green");

        System.out.println("Before Sorting: " + list);


        Collections.sort(list);
        System.out.println("After Sorting (Ascending): " + list);


        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After Sorting (Descending): " + list);
    }
}

