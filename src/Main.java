public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, -2},
                {4, 3, 7},
                {5, 1, 2}
        };

        double res = MatrixMath.findMatrixDeterminant(matrix);
        System.out.println(res);    }
}