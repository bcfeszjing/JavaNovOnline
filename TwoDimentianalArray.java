import java.util.Scanner;

public class TwoDimentianalArray {

    public static void main(String[] args) {  

        Scanner scanner = new Scanner(System.in);

        int [][] matrix = new int[3][4];

        matrix[0][0] = 1; matrix[0][1] = 2; matrix[0][2] = 3; matrix[0][3] = 4;
        matrix[1][0] = 5; matrix[1][1] = 6; matrix[1][2] = 7; matrix[1][3] = 8;
        matrix[2][0] = 9; matrix[2][1] = 10; matrix[2][2] = 11; matrix[2][3] = 12;

        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};

        String [][] matrix3 = new String[2][2];
        int numIndex = 0;


        for (int i = 0; i < matrix3.length; i++) {
            int number = scanner.nextInt();

            if (numIndex < matrix3.length){
                matrix3[numIndex][0] = String.valueOf(number);
                numIndex++;
            }
            
        }

        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; i < matrix3[j].length; j++){
                System.out.println(matrix3[i][j]);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("==========================");

        for (int[] i : matrix2) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
    
}