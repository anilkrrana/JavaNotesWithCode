/*
 * Topic: Expressions in Java
 *
 * An expression is a combination of variables, operators, and values that produces a result.
 * Example: 10 + 5 is an expression.
 *
 * Interview note:
 * Expressions are evaluated by the Java compiler at runtime and produce a value.
 */

public class Expressions {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int division = a / b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);
    }
}
