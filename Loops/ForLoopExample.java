package Loops;

import java.util.Scanner;

/*
 * Topic:   in Java
 *
 * Interview-level explanation:
 * A   is used when the number of iterations is known beforehand.
 * It is ideal for traversing arrays, iterating a fixed range, or repeating a task a known number of times.
 *
 * Structure:
 * for (initialization; condition; update) {
 *     // code
 * }
 *
 * Why use  ?
 * - Best when iteration count is predetermined
 * - More compact and readable than while in fixed-range scenarios
 * - Commonly used in arrays, collections, and repeated tasks
 */

public class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("  Example");
        // Scanner sc = new Scanner(System.in);
        // int i;
        // int n = sc.nextInt();
        // for (i = 1; i<=n; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //     }
        //     System.out.println("Iteration: " + i);
        // }
        // while (i <= 9) {
        //     i++;
        //     System.out.println(i);
            
        // }
        Scanner sc = new Scanner(System.in);
        String password = "";

        while (!password.equals("java123")) {
            System.out.print("Enter password: ");
            password = sc.nextLine();
            System.out.println("Try again!");
        }

        System.out.println("Access granted!");

        // System.out.println("Final value of i: " + i);
    }
}


// public class ForLoopExample {
//     public static void main(String[] args) {
//         System.out.println("Example");
//         System.out.println("Example");
//         System.out.println("Example");
//         System.out.println("Example");
//     }
// }