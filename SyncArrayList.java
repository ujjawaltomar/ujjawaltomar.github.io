import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


        List<String> syncList = Collections.synchronizedList(list);

        syncList.add("Java");
         


        synchronized (syncList) {
            for (String s : syncList) {
                System.out.println(s);
            }
        }
    }
}

