import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;

        // Convert yards to miles
        double distanceInMiles = distanceInYards / 1760;

        // Output
        System.out.println(
            "The distance in feet is " + distanceInFeet +
            ", in yards is " + distanceInYards +
            " and in miles is " + distanceInMiles
        );

        input.close();
    }
}
