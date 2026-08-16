/*
 * Topic: Logical Operators in Java
 *
 * Logical operators are used to combine boolean expressions.
 * Common logical operators:
 * - && : AND
 * - || : OR
 * - !  : NOT
 *
 * Interview note:
 * Logical operators are used in conditions to check multiple conditions together.
 */

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 22;
        int marks = 80;

        boolean hasVoterId = true;
        boolean isQualified = (age >= 18) && (marks >= 60);
        boolean isEligible = hasVoterId || (marks > 90);
        boolean isNotQualified = !(marks >= 60);

        System.out.println("Age >= 18 and marks >= 60: " + isQualified);
        System.out.println("Has voter ID or marks > 90: " + isEligible);
        System.out.println("Not qualified: " + isNotQualified);
    }
}
