package SwitchCase;

/*
 * Topic: Switch Case in Java
 *
 * Interview-level explanation:
 * The switch statement is used when a single variable needs to be compared against multiple
 * constant values. It is often cleaner and more readable than a long chain of if-else statements.
 *
 * Why use switch?
 * - Best for discrete values such as menu options, grades, days, states, and enums
 * - Improves readability for multiple fixed cases
 * - Commonly used with int, char, String, and enum in Java
 *
 * Important points:
 * - Each case must end with break (unless you intentionally want fall-through)
 * - default works like else in an if-else chain
 * - switch is more suitable than if-else when values are limited and known in advance
 */

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a grade (A, B, C, D): ");
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent! You scored very high.");
                break;
            case 'B':
                System.out.println("Good job! Keep improving.");
                break;
            case 'C':
                System.out.println("Fair performance. Work a little harder.");
                break;
            case 'D':
                System.out.println("You passed with minimum score.");
                break;
            default:
                System.out.println("Invalid grade. Please enter A, B, C, or D.");
        }

        sc.close();
    }
}
