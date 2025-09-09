import java.util.Arrays;

public class
ArrayEquality {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3};
        int[]arr2 = {1,2,3};
        boolean isEqual = Arrays.equals(arr1,arr2);
        System.out.println("Array are equal;"+isEqual);
    }
}
