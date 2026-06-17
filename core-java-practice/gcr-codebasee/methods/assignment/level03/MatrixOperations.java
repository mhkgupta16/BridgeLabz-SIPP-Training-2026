import java.util.Arrays;

public class MatrixOperations {

    public static int[][] createMatrix(
            int rows, int columns) {

        int[][] matrix =
                new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                matrix[i][j] =
                        (int)(Math.random() * 10);
            }
        }

        return matrix;
    }

    public static int[][] addMatrices(
            int[][] first,
            int[][] second) {

        int rows = first.length;
        int columns = first[0].length;

        int[][] result =
                new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                result[i][j] =
                        first[i][j] +
                        second[i][j];
            }
        }

        return result;
    }

    public static int[][] subtractMatrices(
            int[][] first,
            int[][] second) {

        int rows = first.length;
        int columns = first[0].length;

        int[][] result =
                new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                result[i][j] =
                        first[i][j] -
                        second[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(
            int[][] first,
            int[][] second) {

        int[][] result =
                new int[first.length]
                        [second[0].length];

        for (int i = 0; i < first.length; i++) {

            for (int j = 0; j < second[0].length; j++) {

                for (int k = 0; k < second.length; k++) {

                    result[i][j] +=
                            first[i][k] *
                            second[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(
            int[][] matrix) {

        for (int[] row : matrix) {

            System.out.println(
                    Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        int[][] matrix1 =
                createMatrix(3, 3);

        int[][] matrix2 =
                createMatrix(3, 3);

        System.out.println("Matrix 1");
        printMatrix(matrix1);

        System.out.println("Matrix 2");
        printMatrix(matrix2);

        System.out.println("Addition");
        printMatrix(
                addMatrices(matrix1, matrix2));

        System.out.println("Subtraction");
        printMatrix(
                subtractMatrices(matrix1, matrix2));

        System.out.println("Multiplication");
        printMatrix(
                multiplyMatrices(matrix1, matrix2));
    }
}