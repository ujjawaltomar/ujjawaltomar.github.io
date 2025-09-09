import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //concatenation
        String firstName = "ujjawal";
        String lastName = "tomar";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName.length());
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));

        }
    }
}