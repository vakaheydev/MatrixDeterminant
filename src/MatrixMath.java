public class MatrixMath {
    public static double findMatrixDeterminant(int[][] array) {
        double result = 0;
        int lengthOf2ndArray = array[0].length;

        if (lengthOf2ndArray != array.length) {
            System.out.println("Массив не пропорционален (x*x)");
            return result;
        }

        for (int[] i : array) {
            if (i.length != lengthOf2ndArray) {
                System.out.println("Массив не пропорционален (x*x)");
                return result;
            }
        }

        // Базовый случай
        if (array.length == 2) {
            return array[0][0] * array[1][1] - array[0][1] * array[1][0];
        }

        // Рекурсивный случай
        for (int i = 0; i < array.length; i++) {
            int[][] subMatrix = new int[array.length - 1][array.length - 1];

            for (int j = 0; j < array.length - 1; j++) {
                for (int k = 1; k < array.length; k++) {
                    if (k - 1 < i) {
                        subMatrix[j][k - 1] = array[j + 1][k - 1];
                        continue;
                    }
                    subMatrix[j][k - 1] = array[j + 1][k];
                }
            }
            result += Math.pow(-1, i) * array[0][i] * findMatrixDeterminant(subMatrix);
        }
        return result;
    }
}
