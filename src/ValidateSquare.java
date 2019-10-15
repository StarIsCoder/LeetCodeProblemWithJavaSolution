public class ValidateSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(256));
    }

    public static boolean isPerfectSquare(int num) {
        //Brute force ----- 581ms
//        if (num == 1) return true;
//        for (int i = 0; i < num / 2; i++) {
//            if (i * i == num) return true;
//        }
//        return false;
        //square number = 1 + 3 + 5 + 7 + 9 ...
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
