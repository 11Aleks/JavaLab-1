/**
 * This program demonstrates matrix manipulation operations such as matrix transposition,
 * finding the minimum elements in each column, and summing them up.
 */
public class Main {
    /**
     * The main method that runs the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         *Define the size of the matrix
         */
        byte rows = 3;
        byte columns = 3;
        /**
         *Initialize the matrix with predefined values
         */
        byte[][] matrix = {
                {1, 7, 1},
                {9, 2, 4},
                {5, 8, 1}
        };
        /**
         *Create an empty matrix and fill it
         */
        byte[][] matrixT = new byte[rows][columns];
        for (byte i = 0; i < rows; i++) {
            for (byte j = 0; j < columns; j++) {
                matrixT[j][i] = matrix[i][j];
            }
        }
        /**
         *Print the original matrix
         */
        System.out.println("Початкова матриця:");
        for (byte i = 0; i < rows; i++) {
            for (byte j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
           System.out.println();
        }
        /**
         *Print the transporeted matrix
         */
        System.out.println("Транспонована матриця:");
        for (byte i = 0; i < rows; i++) {
            for (byte j = 0; j < columns; j++) {
                System.out.print(matrixT[i][j] + " ");
            }
            System.out.println();
        }
        /**
         *Find the min el in each column of the transporeted matrix
         */
        byte[] minElements = new byte[columns];
        for (byte j = 0; j < columns; j++) {
            byte min = matrixT[0][j];
            for (byte i = 1; i < rows; i++) {
                if (matrixT[i][j] < min) {
                    min = matrixT[i][j];
                }
            }
                minElements[j] = min;
        }
        /**
         *Calculate the sum of the min el in each column
         */
        byte sumMinElements = 0;
        for (byte j = 0; j < columns; j++) {
            sumMinElements += minElements[j];
        }
        /**
         *Print the sum of the min el in each column
         */
        System.out.println("Cума найменших елементів кожного стовпця матриці: " + sumMinElements);
    }

}
