import  java.util.ArrayList;
import java.util.Collection;


public class ArrayLists {
    public static void main(String[] args) {

           ArrayList<Integer>list = new ArrayList<Integer>();
           list.add(0);
           list.add(2);
           list.add(3);
        System.out.println(list);
         //get element

        int element = list.get(0);
        System.out.println(element);
        //add ele in between
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        // loops
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();


    }
}
