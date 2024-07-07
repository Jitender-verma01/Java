import java.util.Scanner;

public class TriangleType {

    public static String classifyTriangle(double a, double b, double c) {
        // Check for a valid triangle first
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                return "Equilateral";
            } else if (a == b || b == c || a == c) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        } else {
            return "Not a valid triangle";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side: ");
        double side3 = scanner.nextDouble();

        String result = classifyTriangle(side1, side2, side3);
        System.out.println("The triangle is: " + result);

        scanner.close();
    }
}
