public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        String str = Integer.toBinaryString(n);
        return str.matches("^10*$");
//        System.out.println(str);
//        char array[] = str.toCharArray();
//        if (array[0] != '1') return false;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] != '0') return false;
//        }
//        return true;
        //10000 & 01111 = 00000
//        int ret = n & (n - 1);
//        return ret == 0;
//        while (n % 2 == 0) {
//            n /= 2;
//        }
//        return n == 1;
    }
}
