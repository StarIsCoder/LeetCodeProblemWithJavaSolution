/*
        A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

        The robot can only move either down or right at any point in time.
        The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

        How many possible unique paths are there?
        Input: m = 3, n = 2
        Output: 3
        Explanation:
        From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
        1. Right -> Right -> Down
        2. Right -> Down -> Right
        3. Down -> Right -> Right
*/

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(7, 3));
    }

    static public int uniquePaths(int m, int n) {
//        // 2D dynamic programming
//        int[][] array = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            array[i][0] = 1;
//        }
//        for (int i = 0; i < n; i++) {
//            array[0][i] = 1;
//        }
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                array[i][j] = array[i - 1][j] + array[i][j - 1];
//            }
//        }
//        return array[m-1][n-1];

        // Only one array, column by column/row by row
        int big = Math.max(m, n);
        int small = Math.min(m, n);
        int[] dp = new int[small];
        for (int i = 0; i < small; i++) {
            dp[i] = 1;
        }
        for (int i = 0; i < big - 1; i++) {
            for (int j = 1; j < small; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}
