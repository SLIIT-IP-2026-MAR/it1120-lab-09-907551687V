import java.util.Scanner;

public class IT26100172Lab9Q4 {

    // a) Method to calculate the final mark (30% assignment + 70% exam)
    public static double calcFinalMark(double assignmentMark, double examMark) {
        double finalMark = (assignmentMark * 0.3) + (examMark * 0.7);
        return finalMark;
    }

    // b) Method to find the grade based on the final mark
    public static char findGrades(double finalMark) {
        char grade;

        if (finalMark >= 75) {
            grade = 'A';
        } else if (finalMark >= 60) {
            grade = 'B';
        } else if (finalMark >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        return grade;
    }

    // c) Method to print the Name, Final Mark and Grade of a student
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-15.2f %-10c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        // d) Get input from the user for 5 students
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = input.nextDouble();

            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);

            System.out.println();
        }

        // Display the Name, Final Mark and Grade of all students
        System.out.printf("%-15s %-15s %-10s%n", "Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}