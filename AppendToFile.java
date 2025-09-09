import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        String filePath = "example.txt";
        String textToAppend = "This is the appended text.\n";

        try {

            FileWriter writer = new FileWriter(filePath, true);
            writer.write(textToAppend);
            writer.close();
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}

