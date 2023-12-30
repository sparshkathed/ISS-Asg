// 1.6 Exception, Hierarchy of exception, Handling exceptions, Throw v/s throws

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Example of ArithmeticException
            int result = divide(10, 0);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        }

        try {
            // Example of CustomException
            validateInput(150);
        } catch (CustomException e) {
            System.err.println("CustomException: " + e.getMessage());
        }
    }

    // Method that throws ArithmeticException
    private static int divide(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            // Rethrow ArithmeticException with a custom message
            throw new ArithmeticException("Division by zero is not allowed");
        }
    }

    // Method that throws CustomException
    private static void validateInput(int value) throws CustomException {
        if (value > 100) {
            throw new CustomException("Input value should not exceed 100");
        } else {
            System.out.println("Input is valid");
        }
    }
}
