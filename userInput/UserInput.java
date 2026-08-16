package userInput;

/*
 * Topic: User Input in Java
 *
 * User input means accepting data from the user while the program is running.
 * In Java, the Scanner class is commonly used to read input from the keyboard.
 *
 * Interview-level explanation:
 * Scanner is a class from the java.util package. It helps read different types of input such as
 * integers, floating-point numbers, and strings. This makes it very useful for interactive programs.
 *
 * Common methods:
 * - nextInt()   -> reads integer values
 * - nextDouble() -> reads decimal values
 * - nextLine()  -> reads a full line of text
 * - next()      -> reads a single word
 *
 * Example question:
 * Q: How do you take input from the user in Java?
 * A: Create a Scanner object and call methods such as nextInt() or nextLine().
 */

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        System.out.println("Hello " + name + ", you are " + age + " years old.");
        System.out.println("Your marks are: " + marks);

        sc.close();
    }
}
