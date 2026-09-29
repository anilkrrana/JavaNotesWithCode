package Strings;

public class StringDemo {
    public static void main(String[] args) {
        // char[] ch = {'t','p','t'};
        // String s = new String(ch);
        // String s1 = "Welcome to Strings";
        // String s2 = "Welcome to Strings";
        // System.out.println(s1 + " " + s2);
        String s1 = new String("Welcome to Strings");
        String s2 = new String("Welcome to Strings");
        //System.out.println(s1 == s2); //Same object/reference
        // System.out.println(s1.equals(s2)); //same content/value equals() method
        // System.out.println(s1.length());
        // System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf('S'));
    }
}
