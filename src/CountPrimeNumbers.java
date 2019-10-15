public class CountPrimeNumbers {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(countPrimes(10000));
        System.out.println(System.currentTimeMillis() - start);
    }

    public static int countPrimes(int n) {
//        if (n <= 2) return 0;
//        int number = 0;
//        for (int i = 2; i < n; i++) {
//            if (isPrime(i)) {
//                number++;
//            }
//        }
//        return number;
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }

        return count;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
