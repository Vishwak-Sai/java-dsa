class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class CustomException {
    static void register(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Registration requires age 18 or older.");
        }
    }

    public static void main(String[] args) {
        try {
            register(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
