public class ClimbStairs {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(climbStairs(44));
        System.out.println(System.currentTimeMillis() - start);
    }

    public static int climbStairs(int n) {
//        Brute force
//        if (n == 1) {
//            return 1;
//        } else if (n == 2) {
//            return 2;
//        } else {
//            return climbStairs(n - 1) + climbStairs(n - 2);
//        }

//        Fibonacci
//        if (n == 1) return 1;
//        int first = 1;
//        int second = 2;
//        for (int i = 3; i <= n; i++) {
//            int third = first + second;
//            first = second;
//            second = third;
//        }
//        return second;

//        Dynamic programming
//        Similar to Fibonacci,Difference is dynamic programming use array to memorize calculation results
        if (n == 1) return 1;
        int dp[] = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
