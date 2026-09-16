import java.util.Scanner;

// class StudentMarksAnalyzer {
//     private static final int PASS_MARK = 40;

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter number of students: ");
//         int n = scanner.nextInt();

//         if (n <= 0) {
//             System.out.println("Number of students must be greater than 0.");
//             scanner.close();
//             return;
//         }

//         int[] marks = new int[n];

//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter marks for student " + (i + 1) + " (0-100): ");
//             marks[i] = scanner.nextInt();

//             while (marks[i] < 0 || marks[i] > 100) {
//                 System.out.print("Marks must be between 0 and 100. Enter again: ");
//                 marks[i] = scanner.nextInt();
//             }
//         }

//         int total = 0;
//         int min = marks[0];
//         int max = marks[0];
//         int passCount = 0;
//         int failCount = 0;
//         int range0To39 = 0;
//         int range40To59 = 0;
//         int range60To79 = 0;
//         int range80To100 = 0;

//         for (int mark : marks) {
//             total += mark;

//             if (mark < min) {
//                 min = mark;
//             }
//             if (mark > max) {
//                 max = mark;
//             }

//             if (mark >= PASS_MARK) {
//                 passCount++;
//             } else {
//                 failCount++;
//             }

//             if (mark <= 39) {
//                 range0To39++;
//             } else if (mark <= 59) {
//                 range40To59++;
//             } else if (mark <= 79) {
//                 range60To79++;
//             } else {
//                 range80To100++;
//             }
//         }

//         double average = (double) total / n;
//         int aboveAverageCount = 0;

//         for (int mark : marks) {
//             if (mark > average) {
//                 aboveAverageCount++;
//             }
//         }

//         System.out.println("\n--- Student Marks Analysis ---");
//         System.out.println("Total marks: " + total);
//         System.out.printf("Average marks: %.2f%n", average);
//         System.out.println("Minimum marks: " + min);
//         System.out.println("Maximum marks: " + max);
//         System.out.println("Pass count: " + passCount);
//         System.out.println("Fail count: " + failCount);
//         System.out.println("Students above average: " + aboveAverageCount);
//         System.out.println("Marks from 0-39: " + range0To39);
//         System.out.println("Marks from 40-59: " + range40To59);
//         System.out.println("Marks from 60-79: " + range60To79);
//         System.out.println("Marks from 80-100: " + range80To100);

//         scanner.close();
//     }
// }

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];
        int passed = 0;
        int failed = 0;

        for (int mark : marks) {
            total += mark;
            if (mark > highest) highest = mark;
            if (mark < lowest) lowest = mark;
            if (mark >= 40) passed++;
            else failed++;
        }

        double average = (double) total / n;

        System.out.println("\nAll Marks:");
        for (int mark : marks) System.out.println(mark);
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
        System.out.println("Passed = " + passed);
        System.out.println("Failed = " + failed);
    }
}

