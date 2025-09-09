import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(10);
        list.add(30);

        list.add(20);
        HashSet<Integer>set=new HashSet<>(list);
        ArrayList<Integer>uniqueLIST = new ArrayList<>(set);
        System.out.println("List without duplicates:"+uniqueLIST);
    }
}
