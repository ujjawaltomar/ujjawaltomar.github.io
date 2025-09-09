public class ReverseEachWord {

    public static void main(String[] args) {
        String input = "Java is fun";

        // Split the string into words
        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        // Reverse each word
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");
        }

        // Trim the trailing space and print
        System.out.println("Original String: " + input);
        System.out.println("Reversed Words: " + result.toString().trim());
    }
}

