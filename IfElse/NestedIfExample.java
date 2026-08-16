/*
 * Topic: Nested If in Java
 *
 * A nested if is an if statement inside another if statement.
 * It is used when a condition depends on another condition.
 *
 * Interview note:
 * Nested if statements are useful for layered conditions and validations.
 */

public class NestedIfExample {
    public static void main(String[] args) {
        int age = 22;
        boolean hasID = true;

        if (age >= 18) {
            System.out.println("You are an adult.");

            if (hasID) {
                System.out.println("You can vote.");
            } else {
                System.out.println("You need an ID to vote.");
            }
        } else {
            System.out.println("You are underage.");
        }
    }
}
