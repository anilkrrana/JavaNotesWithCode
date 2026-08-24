package Loops;

import java.util.Scanner;

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
        // int i = 1;

        // System.out.println("While Loop Example");

    //     while (i <= 5) {
    //         System.out.println("Value of i: " + i);
    //         i++;
    //     }
    // }
            Scanner sc = new Scanner(System.in);
        // String password = "";

        // while (!password.equals("java123")) { //not is equal to "password" true
        //     System.out.print("Enter password: ");
        //     password = sc.nextLine();
        // }
        // int[] i = {1,3,4,24,4,5};
        // System.out.println("While Loop Example :" + i[2] );
        // int[] numbers = {10, 20, 30, 40, 50};
        // numbers[2] = 100;
        // System.out.println(numbers[2]);
        // int[] numbers = {10, 20, 30, 40, 50};

        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // while (i <= 5) {
        //     i++;
        //     System.out.println(i);
            
        // }
            // *
            // **
            // ***
            // ****
            // for (int i = 1; i <= 4; i++) {
            //     for (int j = 1; j <= i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

        // System.out.println("Access granted!");

    }
}
