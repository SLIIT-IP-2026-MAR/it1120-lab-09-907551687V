import java.util.Scanner;

public class IT26100172Lab9Q2 {

    // Method that takes radius as parameter, calculates and returns the area
    public static double circleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static void main(String[] args) {

        double radius, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        // Call the circleArea() method
        area = circleArea(radius);

        System.out.println("The area of the circle with radius " + radius + " is : " + area);
    }
}