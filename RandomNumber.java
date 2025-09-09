
import java.util.Random;

public class RandomNumber{
    public static void main(String[] args) {
        Random rand = new Random();

        int randomInt = rand.nextInt(100); // 0 to 99
        double randomDouble = rand.nextDouble(); // 0.0 to 1.0

        System.out.println("Random Integer (0–99): " + randomInt);
        System.out.println("Random Double (0.0–1.0): " + randomDouble);
    }
}

