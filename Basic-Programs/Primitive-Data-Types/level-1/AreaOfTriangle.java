import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking base and height in inches
        System.out.print("Enter base of the triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double height = input.nextDouble();

        // Area in square inches
        double areaInSquareInches = 0.5 * base * height;

        // Convert to square centimeters
        double areaInSquareCm = areaInSquareInches * 6.4516;

        // Output
        System.out.println(
            "The area of the triangle is " + areaInSquareInches +
            " square inches and " + areaInSquareCm + " square centimeters"
        );

        input.close();
    }
}
