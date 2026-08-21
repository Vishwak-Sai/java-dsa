class MultiCatch {
    public static void main(String[] args) {
        try {
            String value = null;
            System.out.println(value.length());
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("One of several expected runtime errors occurred: "
                    + e.getClass().getSimpleName());
        }
    }
}
