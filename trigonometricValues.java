public class trigonometricValues {

    public static void main(String[] args) {
        double degrees = 45;

        // Convert degrees to radians
        double radians = Math.toRadians(degrees);

        // Trigonometric values
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        System.out.println("Angle: " + degrees + " degrees");
        System.out.println("Sine: " + sin);
        System.out.println("Cosine: " + cos);
        System.out.println("Tangent: " + tan);
    }
}

