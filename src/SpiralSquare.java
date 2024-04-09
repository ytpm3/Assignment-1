//7
public class SpiralSquare {
    public static void main(String[] args) {
        printSpiralSquare(3);
        System.out.println();
        printSpiralSquare(4);
    }

    public static void printSpiralSquare(int n) {
        int[][] matrix = new int[n][n];
        fillMatrix(matrix, 1, 0, n - 1, 0, n - 1);
        printMatrix(matrix);
    }

    public static void fillMatrix(int[][] matrix, int num, int startRow, int endRow, int startCol, int endCol) {
        if (startRow > endRow || startCol > endCol) {
            return;
        }

        for (int i = startCol; i <= endCol; i++) {
            matrix[startRow][i] = num++;
        }

        for (int i = startRow + 1; i <= endRow; i++) {
            matrix[i][endCol] = num++;
        }

        for (int i = endCol - 1; i >= startCol; i--) {
            matrix[endRow][i] = num++;
        }

        for (int i = endRow - 1; i > startRow; i--) {
            matrix[i][startCol] = num++;
        }

        fillMatrix(matrix, num, startRow + 1, endRow - 1, startCol + 1, endCol - 1);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
