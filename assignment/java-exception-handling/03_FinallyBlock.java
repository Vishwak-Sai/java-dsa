class FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Trying risky code...");
            Integer.parseInt("not-a-number");
        } catch (NumberFormatException e) {
            System.out.println("Caught a number-format problem.");
        } finally {
            System.out.println("finally always runs (normally used for cleanup).");
        }
    }
}
