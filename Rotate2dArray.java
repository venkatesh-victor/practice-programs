public class Rotate2dArray {
    public static void main(String[] args) {
        int[][] originalArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] rotatedArray = rotateLeft(originalArray);

        // Print the rotated array
        for (int[] row : rotatedArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateLeft(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] rotatedArray = new int[cols][rows];

        // Rotate the array 90 degrees to the left without transposing
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedArray[cols - 1 - j][i] = arr[i][j];
            }
        }

        return rotatedArray;
    }
}