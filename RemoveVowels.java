public class RemoveVowels {
    public static void main(String[] args) {
        String input = "Hello Java Programming";


        String result = input.replaceAll("(?i)[aeiou]", "");

        System.out.println("Original: " + input);
        System.out.println("Without vowels: " + result);
    }
}


