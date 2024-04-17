//Wite a program to find transpose of matrix

package Two_D_Array;

public class Ass3 {
    public static void printMatrix(int matrix[][]) {
        System.out.println("The Matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 2, 3, 7 }, { 5, 6, 7 } };
        // 2*3 matrix
        int row = 2, col = 3;

        // original matrix
        printMatrix(matrix);

        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }
}
