public class UniqueBSTCound {
    public static void main(String[] args) {
        System.out.println(numTrees(3));
    }

    static public int numTrees(int n) {
//        if (n == 1 || n == 0) {
//            return 1;
//        }
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += numTrees(i - 1) * numTrees(n - i);
//        }
//        return sum;
        int tmp[] = new int[n + 1];
        tmp[0] = 1;
        tmp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                tmp[i] += tmp[j - 1] * tmp[i - j];
            }
        }
        return tmp[n];
    }
}
