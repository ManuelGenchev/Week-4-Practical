public class Calculator {
    // Addition method
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction method
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication method
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division method
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            // Handling division by zero
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Returning NaN (Not a Number) as an indicator of error
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        // Using the Calculator class for calculations
        double resultAddition = add(5.0, 3.0);
        double resultSubtraction = subtract(8.0, 4.0);
        double resultMultiplication = multiply(2.0, 6.0);
        double resultDivision = divide(10.0, 2.0);

        // Displaying results
        System.out.println("Addition: " + resultAddition);
        System.out.println("Subtraction: " + resultSubtraction);
        System.out.println("Multiplication: " + resultMultiplication);
        System.out.println("Division: " + resultDivision);
    }
}
