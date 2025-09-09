import java.util.Arrays;
public class AnagramCheck {

    static boolean areAnagram(String str1,String str2){
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();
        if (str1.length()!=str2.length()){
            return false;
        }
        char[]arr1 = str1.toCharArray();
        char[]arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr1);
        return Arrays.equals(arr1,arr2);

    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        if(areAnagram(s1,s2)){
            System.out.println("The strings are anagrams");

        }else {
            System.out.println("The strings are not ansgrams");
        }
    }
}
