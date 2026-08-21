import java.io.IOException;

class ExceptionChaining {
    static void loadProfile() throws Exception {
        try {
            throw new IOException("profiles.txt was not found");
        } catch (IOException e) {
            throw new Exception("Could not load the user profile.", e);
        }
    }

    public static void main(String[] args) {
        try {
            loadProfile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Original cause: " + e.getCause().getMessage());
        }
    }
}
