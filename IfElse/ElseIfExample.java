/*
 * Topic: Else-If in Java
 *
 * else-if is used when there are multiple conditions to check.
 * Java checks each condition in order until one matches.
 *
 * Interview note:
 * else-if is useful when you need multiple decisions in one program.
 */
public class ElseIfExample {
    public static void main(String[] args) {
        int marks = 78;

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}
