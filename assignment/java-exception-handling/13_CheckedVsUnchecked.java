import java.io.FileNotFoundException;

class CheckedVsUnchecked {
    static void checkedExample() throws FileNotFoundException {
        throw new FileNotFoundException("Checked exceptions must be caught or declared.");
    }

    public static void main(String[] args) {
        try {
            checkedExample();
        } catch (FileNotFoundException e) {
            System.out.println("Checked: " + e.getMessage());
        }

        try {
            throw new NullPointerException("Unchecked exceptions do not require declaration.");
        } catch (NullPointerException e) {
            System.out.println("Unchecked: " + e.getMessage());
        }
    }
}
