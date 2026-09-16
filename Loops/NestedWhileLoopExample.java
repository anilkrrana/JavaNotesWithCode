package Loops;

/*
 * Topic: Nested While Loop in Java
 *
 * Interview-level explanation:
 * A nested while loop is a while loop placed inside another while loop.
 * It is used when a task requires multiple levels of repetition, such as printing rows and columns,
 * processing matrix-like data, or generating patterns.
 *
 * Why use nested while loop?
 * - Best for working with rows and columns
 * - Useful for tabular data and pattern printing
 * - Helps represent multi-dimensional repetition
 *
 * Important point:
 * The inner loop must complete before the outer loop can continue to the next iteration.
 */

public class NestedWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("Nested While Loop Example");

        while (i <= 3) {
            int j = 1;

            while (j <= 3) {
                System.out.print(i + " " + j + " | ");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
