public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean isPowerOfFour(int num) {
        return Integer.bitCount(num) == 1 && (Integer.toBinaryString(num).length() - 1) % 2 == 0;
    }
}
