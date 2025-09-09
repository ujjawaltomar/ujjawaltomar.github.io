import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
       // int numOfDigit = 0;

        int sumOfDigit = 0;
        while (n > 0){
            sumOfDigit += n % 10;
            n = n / 10;
           // numOfDigit++;
        }
       // System.out.println("Number of digit in" + n + " = " + numOfDigit);
        System.out.println("Number of digit in" + n + " = " + sumOfDigit);
    }
}


