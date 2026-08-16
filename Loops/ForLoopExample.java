package Loops;

/*
 * Topic: For Loop in Java
 *
 * Interview-level explanation:
 * A for loop is used when the number of iterations is known beforehand.
 * It is ideal for traversing arrays, iterating a fixed range, or repeating a task a known number of times.
 *
 * Structure:
 * for (initialization; condition; update) {
 *     // code
 * }
 *
 * Why use for loop?
 * - Best when iteration count is predetermined
 * - More compact and readable than while in fixed-range scenarios
 * - Commonly used in arrays, collections, and repeated tasks
 */

public class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("For Loop Example");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
