/*
    Given a m x n grid filled with non-negative numbers,
    find a path from top left to bottom right which minimizes the sum of all numbers along its path.

    Input:
    [
        [1,3,1],
        [1,5,1],
        [4,2,1]
    ]
    Output: 7
    Explanation: Because the path 1→3→1→1→1 minimizes the sum.
*/

public class MinPathSum {
    public static void main(String[] args) {
        int[][] input = {
                {1, 3, 1},
                {1, 5, 1}
        };
        System.out.println(minPathSum(input));
    }

    static public int minPathSum(int[][] grid) {
        // 2D Array
        int row = grid.length;
        int column = grid[0].length;
        int[][] dp = new int[row][column];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < column; i++) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }
        for (int i = 1; i < row; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
            }
        }
        return dp[row - 1][column - 1];

    }
}
