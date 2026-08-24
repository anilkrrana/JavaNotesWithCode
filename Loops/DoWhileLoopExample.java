package Loops;

import java.util.Scanner;

/*
 * Topic: Do-While Loop in Java
 *
 * Interview-level explanation:
 * A do-while loop is similar to a while loop, but it guarantees that the loop body executes at least once.
 * This is because the condition is checked after the first iteration.
 *
 * Structure:
 * do {
 *     // code
 * } while (condition);
 *
 * Why use do-while loop?
 * - Best when the action must happen at least once
 * - Commonly used in menu-driven programs and validation prompts
 * - Executes the body first, then checks the condition
 */

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Start");
            System.out.println("2. Settings");
            System.out.println("3. Exit");
            choice = sc.nextInt();
        } while (choice != 5);
    }
}
