package Strings;
import java.util.*;
import java.util.stream.Collectors;

public class StringDemo {
    public static void main(String[] args) {
        // char[] ch = {'t','p','t'};
        // String s = new String(ch);
        // String s1 = "Welcome to Strings";
        // String s2 = "Welcome to Strings";
        // System.out.println(s1 + " " + s2);
        // String s1 = new String("Welcome to Strings");
        // String s2 = new String("Welcome to Strings");
        
        //compareTo() method compares two strings lexicographically. It returns a negative integer, zero, or a positive integer as the first string is less than, equal to, or greater than the second string.
        // String name = "Jack";
        // String name2 = "Jacks";
        // System.out.println(name.compareTo(name2)); //-1

        //System.out.println(s1 == s2); //Same object/reference
        // System.out.println(s1.equals(s2)); //same content/value equals() method
        // System.out.println(s1.length());
        // System.out.println(s1.charAt(0));
        // System.out.println(s2.indexOf('S'));

        //startsWith() and endsWith() methods are used to check whether a string starts or ends with a specific prefix or suffix.
        //String str = "Welcome to Strings";
        // System.out.println(str.startsWith("el")); //false
        // System.out.println(str.endsWith("Strings")); //true

        //Concatenation of strings can be done using the + operator or the concat() method.
        // 
        // String str = "Welcome " + "to Strings";
        // System.out.println(str); //true
        
        //Concat()
        // String str1 = "Welcome ";
        // String str2 = "to Strings";
        // System.out.println(str1.concat(str2)); //Welcome to Strings

        //Join() method is used to join multiple strings with a specified delimiter.
        // String str1 = "Welcome";
        // String str2 = "to Strings";
        // String JoinedString = String.join(" ", str1, str2);
        // System.out.println(JoinedString);

        //Format() method is used to format strings in a specific way. It allows you to create formatted strings by specifying placeholders and providing values for those placeholders.
        // String name = "John";
        // int age = 25;   
        // String formattedString = String.format("My name is %s and %s I am %d years old.", name, name, age);
        // System.out.println(formattedString);

        //StringBuilder is a mutable sequence of characters that allows you to efficiently modify strings without creating new string objects. It provides methods for appending, inserting, deleting, and modifying characters in the string.
        // String fName= "James";
        // String lName= "Gosling";

        // //using stringBuilder for efficient string concatenation
        // StringBuilder fullName = new StringBuilder();
        // fullName.append("Hello, my name is ");
        // fullName.append(fName);
        // fullName.append(" ");
        // fullName.append(lName);
        // fullName.append(". Nice to meet you!");
        // String result = fullName.toString();
        // System.out.println(result);

        // .joining() method is used to join multiple strings with a specified delimiter. It allows you to concatenate strings together while inserting a delimiter between them.
        // String str1 = "Welcome";
        // String str2 = "to Strings";
        // String str3 = "in Java";
        // String joinedString = String.join(" ", str1, str2, str3);
        // System.out.println(joinedString);

        //Example-2:
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");
        String str = fruits.stream().collect(Collectors.joining(", "));
        System.out.println(str); //Output: Apple, Banana, Orange

    }
}
