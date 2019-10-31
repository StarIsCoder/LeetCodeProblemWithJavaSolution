/*You are given an n x n 2D matrix representing an image.

  Rotate the image by 90 degrees (clockwise).
Given input matrix =
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
*/

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] twoD_arr = new int[3][3];
    }

    public void rotate(int[][] matrix) {
/*
            [1,2,3],              [1,4,7]
            [4,5,6],       --->   [2,5,8]
            [7,8,9]               [3,6,9]
  */
        //first transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        /*
            [1,2,3],              [7,4,1]
            [4,5,6],       --->   [8,5,2]
            [7,8,9]               [9,6,3]
  */
        // then reverse
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = tmp;
            }
        }
    }
}
