public class IT26100172Lab9Q3 {

    // Method to add two integers and return the result
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to multiply two integers and return the result
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to square a number (multiply it by itself) and return the result
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {

        // Expression i: (3 * 4 + 5 * 7)^2
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));

        // Expression ii: (4 + 7)^2 + (8 + 3)^2
        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)^2      : " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2  : " + result2);
    }
}