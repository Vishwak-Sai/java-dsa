class NestedTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try started.");
            try {
                int number = Integer.parseInt("abc");
                System.out.println(number);
            } catch (NumberFormatException e) {
                System.out.println("Inner catch handled invalid number input.");
            }
        } catch (Exception e) {
            System.out.println("Outer catch handled: " + e.getMessage());
        }
    }
}
