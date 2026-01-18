import java.util.Scanner;

public class SquareSideFromPerimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking perimeter as input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Perimeter = 4 × side
        double side = perimeter / 4;

        // Output
        System.out.println(
            "The length of the side is " + side +
            " whose perimeter is " + perimeter
        );

        input.close();
    }
}
