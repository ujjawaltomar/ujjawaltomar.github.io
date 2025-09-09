    //public class FindDuplicates {
  //  public static void main(String[] args) {
    //    int[]array ={1,2,3,4,5,5};
      //  System.out.println("Duplicate elements:");

import java.util.HashSet;

//for (int i = 0;i<array.length;i++){
          //  for (int j = i+1;j<array.length;j++){
            //    if (array[i]==array[j]){
              //      System.out.println(array[i]+"");
                //    break;
               // }
   //         }
 //    //   }
   // }
//}
// using HASHSET
public class FindDuplicates {
            public static void main(String[] args) {
                int[]array = {1,2,3,4,3,5};
                HashSet<Integer>seen = new HashSet<>();
                HashSet<Integer>duplicates=new HashSet<>();
                for (int num:array){
                    if (!seen.add(num)){
                        duplicates.add(num);
                    }
                }
                System.out.println("Duplicates elements:"+duplicates);
            }
}