import java.util.Scanner;

class Employee{

    //instance variable
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work(){
        System.out.println(name + "is working");
    }
}

class Developer extends Employee{

    public Developer(String name, double salary) {
        super(name, salary);
    }

    void work(){
        System.out.println(name + "is developing software");
    }
}

class Tester extends Employee{

    public Tester(String name, double salary) {
        super(name, salary);
    }

    void work(){
        System.out.println(name + "is testing software");
    }
}

class Manager extends Employee{

    public Manager(String name, double salary) {
        super(name, salary);
    }

    void work(){
        System.out.println(name + "is managing software");
    }
}



public class EmployeeManagementSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Developer name: ");
        String dName = sc.nextLine();

        System.out.println("Enter Developer salary: ");
        Double dSalary = sc.nextDouble(); 
        sc.nextLine();

        System.out.println("Enter Tester name: ");
        String tName = sc.nextLine();

        System.out.println("Enter Tester salary: ");
        Double tSalary = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter Manager name: ");
        String mName = sc.nextLine();

        System.out.println("Enter Manager salary: ");
        Double mSalary = sc.nextDouble();
        sc.nextLine();

        Employee d = new Developer(dName, dSalary);
        Employee t = new Tester(tName, tSalary);
        Employee m = new Manager(mName, mSalary);

        System.out.println("\n ----Employee Details-----");

        d.work();
        t.work();
        m.work();
    }
}
