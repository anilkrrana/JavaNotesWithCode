package Methods;

/*
 * Topic: Methods in Java
 *
 * A method is a block of code that does one job.
 * We write it once and call it whenever we need it.
 *
 * Example syntax:
 * static returnType methodName(parameters) {
 *     // code
 *     return value;
 * }
 */
public class MethodsExample {

    public static void main(String[] args) {
        System.out.println("--- Simple Method Examples ---");

        // 1. No input and no result
        greet();

        // 2. Input, but no result
        showName("Anil");

        // 3. No input, but gives back a result
        int number = getNumber();
        System.out.println("Number: " + number);

        // 4. Input and gives back a result
        int total = add(10, 20);
        System.out.println("Total: " + total);
    }

    // No parameters and no return value
    public static void greet() {
        System.out.println("Hello, students!");
    }

    // One parameter and no return value
    public static void showName(String name) {
        System.out.println("My name is " + name);
    }

    // No parameters and an int return value
    public static int getNumber() {
        return 10;
    }

    // Two parameters and an int return value
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
