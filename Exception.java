import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        System.out.println("open the file");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int a =sc.nextInt();
        try {
            int b = 45 / a;
            System.out.println("value of b =" + b);
            int arr[] = {10, 20, 30};
            arr[5] = 90;
        }
        catch (ArithmeticException ae)
            {
    System.out.println(ae);
}
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println(aie);
        }
        finally {
            int c = a + 90;
            System.out.println("value=" + c);

            System.out.println("close the file");
        }
}
    }

