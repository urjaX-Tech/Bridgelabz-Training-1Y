import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Get number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Step b: Calculate maximum handshakes using combination formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Step c: Display the result
        System.out.println("Maximum number of handshakes possible: " + maxHandshakes);

        sc.close();
    }
}
