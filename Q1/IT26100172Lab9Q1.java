import java.util.Scanner;

public class IT26100172Lab9Q1 {
    public static void main(String[] args) {

        double a, b, c;
        double discriminant, root1, root2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        a = input.nextDouble();

        System.out.print("Enter value b: ");
        b = input.nextDouble();

        System.out.print("Enter value c: ");
        c = input.nextDouble();

        // Calculate the discriminant: b^2 - 4ac
        discriminant = Math.pow(b, 2) - (4 * a * c);

        System.out.println();

        if (discriminant > 0) {
            // Roots are real and different
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Roots are real and different :");
            System.out.printf("Root 1: %.2f%n", root1);
            System.out.printf("Root 2: %.2f%n", root2);

        } else if (discriminant == 0) {
            // Roots are real and equal
            root1 = -b / (2 * a);

            System.out.println("Roots are real and equal :");
            System.out.printf("Root: %.2f%n", root1);

        } else {
            // Roots are imaginary (complex)
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("Roots are imaginary :");
            System.out.printf("Root 1: %.2f + %.2fi%n", realPart, imaginaryPart);
            System.out.printf("Root 2: %.2f - %.2fi%n", realPart, imaginaryPart);
        }
    }
}