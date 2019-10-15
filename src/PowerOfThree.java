public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(45));
        String baseChange = Integer.toString(8, 2);
        System.out.println(baseChange);
    }

    public static boolean isPowerOfThree(int n) {
        //loop iteration
//        if (n < 1) return false;
//        while (n % 3 == 0) {
//            n = n / 3;
//        }
//        return n == 1;
        //Integer.toString(i,radix);
        //将i转变为radix进制数
        //Integer.toString(8, 2); -> log2(8) = 3, return 1000
        //Integer.toString(81, 3); -> log3(81) = 4, return 10000
//        String baseChange = Integer.toString(n, 3);
//        return baseChange.matches("^10*$");
        //Mathematics
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
