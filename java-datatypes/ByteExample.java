// Definition:
// A bit is the smallest unit of digital information.
// A bit can be either 0 or 1.
// A byte is a group of 8 bits.
// In Java, byte is a primitive data type used to store small integer values.
// It takes 1 byte of memory and stores values from -128 to 127.
//
// Example:
// 1 byte = 8 bits
// Example binary: 00001010 = 10 in decimal

public class ByteExample {
    public static void main(String[] args) {
        byte age = 25;
        byte minValue = -128;
        byte maxValue = 127;

        System.out.println("Byte example");
        System.out.println("Age: " + age);
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);

        // A byte is made of 8 bits
        System.out.println("A byte = 8 bits");
    }
}
