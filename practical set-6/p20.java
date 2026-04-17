/*
Take the value of denominator and numerator from user using command-line argument.
Implement the concept of exception handling to manage all possible run-time error.
*/

public class p20 {
    public static void main(String[] args) {
        try {
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Result : " + result);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two command-line arguments!");
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter valid integer values!");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred!");
        }
    }
}
