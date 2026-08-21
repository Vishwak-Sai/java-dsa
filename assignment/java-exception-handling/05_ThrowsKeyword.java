import java.io.IOException;

class ThrowsKeyword {
    static void connectToService() throws IOException {
        throw new IOException("Service is unavailable.");
    }

    public static void main(String[] args) {
        try {
            connectToService();
        } catch (IOException e) {
            System.out.println("Handled declared exception: " + e.getMessage());
        }
    }
}
