class ExceptionPropagation {
    static void levelThree() {
        throw new ArithmeticException("Failure started in levelThree");
    }

    static void levelTwo() {
        levelThree(); // Exception moves up because it is not handled here.
    }

    public static void main(String[] args) {
        try {
            levelTwo();
        } catch (ArithmeticException e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }
}
