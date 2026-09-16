package Loops;

import java.util.Scanner;

/*
 * Topic: Do-While Loop in Java
 *
 * Interview-level explanation:
 * A do-while loop is similar to a while loop, but it guarantees that the loop body executes at least once.
 * This is because the condition is checked after the first iteration.
 *
 * Structure:
 * do {
 *     // code
 * } while (condition);
 *
 * Why use do-while loop?
 * - Best when the action must happen at least once
 * - Commonly used in menu-driven programs and validation prompts
 * - Executes the body first, then checks the condition
 */

// class Student {
//     String name;
//     int age;
//     int marks;
 
//     void displayDetails() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Marks: " + marks);
//     }
// }
// public class DoWhileLoopExample {
//     public static void main(String[] args) {
//         Student student1 = new Student();
//         student1.name = "Rahul";
//         student1.age = 20;
//         student1.marks = 85;
//         student1.displayDetails();
//     }
// }
//Superclass (parent)

class Vehicle{
	void start(){
	 System.out.println("Vehicle starting");
	}
	void stop() {
		System.out.println("Vehicle stopping");
	}
}

//SubClass (Child)
class Car extends Vehicle{
	void honk(){
		System.out.println("Car is Honking");
	}
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); 
		
		//Calling inherited methods(from vehicle)
		myCar.start();
		myCar.stop();
		//Calling child class method
		myCar.honk();
    }
}