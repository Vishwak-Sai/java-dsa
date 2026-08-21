import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new StringReader("Hello, Java!"))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Read failed: " + e.getMessage());
        }
        // reader is closed automatically here.
    }
}
