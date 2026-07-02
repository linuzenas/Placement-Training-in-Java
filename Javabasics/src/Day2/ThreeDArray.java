package Day2;

public class ThreeDArray {

    public static void main(String[] args) {

        int[][][] cube = {

                {
                        {1, 2},
                        {3, 4}
                },

                {
                        {5, 6},
                        {7, 8}
                }

        };

        for (int i = 0; i < cube.length; i++) {

            System.out.println("Layer " + i);

            for (int j = 0; j < cube[i].length; j++) {

                for (int k = 0; k < cube[i][j].length; k++) {

                    System.out.print(cube[i][j][k] + " ");

                }

                System.out.println();

            }

            System.out.println();

        }

    }
}