package oops;

//Creating an abstract class having abstract method
abstract class Bike{
	abstract void run();
}

//Creating a subClass/Child class and override abstract method
class Pulsor extends Bike{
	void run(){
		System.out.println("running safely");
	}
}

//Creating a Maain class to create object and call methods
public class Abstraction {
    public static void main(String args[]){
		Bike obj = new Pulsor();
		obj.run();
	}
}
