package Day3;

public class MatrixAddition {

    public static void main(String[] args) {

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrix2 = {
                {7, 8, 9},
                {1, 2, 3}
        };

        int[][] sum = new int[2][3];

        // Matrix Addition
        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1[i].length; j++) {

                sum[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }

        // Display Result
        System.out.println("Resultant Matrix:");

        for (int i = 0; i < sum.length; i++) {

            for (int j = 0; j < sum[i].length; j++) {

                System.out.print(sum[i][j] + " ");

            }

            System.out.println();
        }

    }
}