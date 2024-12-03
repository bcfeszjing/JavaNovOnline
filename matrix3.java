import java.util.Scanner;

public class matrix3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix3 = new String[2][2];

        // Prompt the user to enter a number for each slot in the matrix
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.println("Enter a number for slot [" + i + "][" + j + "]:");
                matrix3[i][j] = scanner.next();
            }
        }

        // Display the matrix
        System.out.println("The matrix numbers are:");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " "); // Print row elements on the same line
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}
