public class DecimalToRoman {

    public static void main(String[] args) {
        int number = 1987;
        System.out.println("Decimal: " + number);
        System.out.println("Roman: " + toRoman(number));
    }

    public static String toRoman(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9,   5, 4,  1};
        String[] romans = {"M",  "CM","D", "CD","C", "XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(romans[i]);
            }
        }

        return result.toString();
    }
}

