import java.util.Arrays;

public class MatrixAdvancedOperations {

    public static int[][] transpose(
            int[][] matrix) {

        int[][] transpose =
                new int[matrix[0].length]
                        [matrix.length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                transpose[j][i] =
                        matrix[i][j];
            }
        }

        return transpose;
    }

    public static int determinant2x2(
            int[][] matrix) {

        return (matrix[0][0] * matrix[1][1])
             - (matrix[0][1] * matrix[1][0]);
    }

    public static void printMatrix(
            int[][] matrix) {

        for (int[] row : matrix) {

            System.out.println(
                    Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {4, 7},
                {2, 6}
        };

        System.out.println("Matrix");
        printMatrix(matrix);

        System.out.println("Transpose");
        printMatrix(transpose(matrix));

        System.out.println(
                "Determinant = " +
                determinant2x2(matrix));
    }
}