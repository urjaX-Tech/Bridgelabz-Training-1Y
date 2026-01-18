import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {

        double km;   // as per hint

        Scanner input = new Scanner(System.in);   // Scanner object

        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();   // taking user input

        // Using given formula: 1 mile = 1.6 km
        double miles = km / 1.6;

        System.out.println(
            "The total miles is " + miles + " mile for the given " + km + " km"
        );

        input.close();
    }
}
