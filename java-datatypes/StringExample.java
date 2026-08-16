// Java String Example
// String is a class in Java used to store text data.
// It is not a primitive type like int or char.
// A String represents a sequence of characters enclosed in double quotes.
// Example: "Hello, Java!"
// Strings are immutable, which means once created, their value cannot be changed.
// Java provides many useful methods for String manipulation, such as length(), toUpperCase(), and substring().

public class StringExample {
    public static void main(String[] args) {
        // Declaring and initializing a String
        String message = "Hello, Java!";

        // Printing the string
        System.out.println("Message: " + message);

        // Using String methods
        System.out.println("Length: " + message.length());
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Substring: " + message.substring(7, 11));

        // Example of immutability
        String name = "Alice";
        String updatedName = name.toUpperCase();
        System.out.println("Original name: " + name);
        System.out.println("Updated name: " + updatedName);
    }
}
