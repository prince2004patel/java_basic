//The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors
// so that the normal flow of the application can be maintained.

public class Arithmetic_exception {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d; // Attempting division by zero deliberately
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

        try {
            int x[] = {1};
            x[42] = 99; // Attempting to access an index that is out of bounds deliberately
            System.out.println("This will not be printed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } finally {
            System.out.println("The finally block always executes");
        }
    }
}

