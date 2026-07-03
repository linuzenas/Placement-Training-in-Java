package Day3;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        // Input Matrix 1
        System.out.println("\nEnter Matrix 1:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix1[i][j] = sc.nextInt();

            }
        }

        // Input Matrix 2
        System.out.println("\nEnter Matrix 2:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix2[i][j] = sc.nextInt();

            }
        }

        // Addition
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                sum[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }

        // Display Result
        System.out.println("\nResultant Matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print(sum[i][j] + " ");

            }

            System.out.println();
        }

        sc.close();
    }
}