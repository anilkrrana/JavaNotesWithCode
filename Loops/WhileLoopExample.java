package Loops;

/*
 * Topic: While Loop in Java
 *
 * Interview-level explanation:
 * A while loop is a condition-controlled loop. It repeats as long as the condition remains true.
 * It is useful when the number of iterations is not known before execution.
 *
 * Structure:
 * while (condition) {
 *     // code
 * }
 *
 * Why use while loop?
 * - Best when the loop depends on dynamic conditions
 * - Common in user-input validation and game loops
 * - The condition is checked before executing the body
 */

public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("While Loop Example");

        while (i <= 5) {
            System.out.println("Value of i: " + i);
            i++;
        }
    }
}
