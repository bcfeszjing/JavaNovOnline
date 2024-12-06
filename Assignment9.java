import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choice 1 - 3*4 matrix");
        System.out.println("Choice 2 - 2*3 matrix");
        int [][] matrix1 = new int[3][4];
        int [][] matrix2 = new int[2][3];

        System.out.print("Please choose a choice: ");
        int choice = scanner.nextInt();

        try {
            switch (choice) {
                case 1:
                    System.out.println("Enter 3*4 matrix:");
                    for (int i = 0; i < matrix1.length; i++) {
                        for (int j = 0; j < matrix1[i].length; j++) {
                            System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
                            matrix1[i][j] = scanner.nextInt();
                        }
                    }
    
                    System.out.println();
                    System.out.println("--------------------------");
    
                    System.out.println("3*4 Matrix:");
                    for (int i = 0; i < matrix1.length; i++) {
                        for (int j = 0; j < matrix1[i].length; j++) {
                        System.out.print(matrix1[i][j] + " ");
                        }
                    System.out.println();
                    }
                
                break;
    
                case 2:
                    System.out.println("Enter 2*3 matrix:");
                    for (int i = 0; i < matrix1.length; i++) {
                        for (int j = 0; j < matrix2[i].length; j++) {
                            System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
                            matrix2[i][j] = scanner.nextInt();
                        }
                    }
    
                    System.out.println();
                    System.out.println("--------------------------");
    
                    System.out.println("2*3 Matrix:");
                    for (int i = 0; i < matrix1.length; i++) {
                        for (int j = 0; j < matrix1[i].length; j++) {
                        System.out.print(matrix1[i][j] + " ");
                        }
                    System.out.println();
                    }
    
                break;
    
                default:
                    System.out.println("Invalid choice");
                    break;
            }       
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }
    }
    
}
