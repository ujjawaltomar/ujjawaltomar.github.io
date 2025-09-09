public class ReversePreserveSpace {

    public static void main(String[] args) {
        String input = "a b c d";
        char[] chars = input.toCharArray();
        char[] result = new char[chars.length];

        // Mark positions of spaces
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Use two pointers to reverse non-space characters
        int j = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                while (result[j] == ' ') {
                    j--;
                }
                result[j--] = chars[i];
            }
        }

        // Output the result
        System.out.println("Original : " + input);
        System.out.println("Reversed : " + new String(result));
    }
}

