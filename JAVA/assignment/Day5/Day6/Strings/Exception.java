import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int firstInteger = scanner.nextInt();

        System.out.println("Enter second integer:");
        int secondInteger = scanner.nextInt();

        // Check if the two integers are valid. If not, throw an exception.
        if (!isValidInteger(firstInteger) || !isValidInteger(secondInteger)) {
            throw new NumberFormatException("Invalid integer input.");
        }

        // Do something with the two integers.
        // For example, print the sum of the two integers.
        int sum = firstInteger + secondInteger;
        System.out.println("Sum of the two integers is: " + sum);
    }

    /**
     * Checks if the given input is a valid integer.
     *
     * @param input The input to check.
     * @return True if the input is a valid integer, false otherwise.
     */
    private static boolean isValidInteger(int input) {
        try {
            Integer.parseInt(String.valueOf(input));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}