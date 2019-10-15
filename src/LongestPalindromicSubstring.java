public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "klvxwqyzugrdoaccdafdfrvxiowkcuedfhoixzipxrkzbvpusslsgfjocvidnpsnkqdfnnzzawzsslwnvvjyoignsfbxkgrokzyusxikxumrxlzzrnbtrixxfioormoyyejashrowjqqzifacecvoruwkuessttlexvdptuvodoavsjaepvrfvbdhumtuvxufzzyowiswokioyjtzzmevttheeyjqcldllxvjraeyflthntsmipaoyjixygbtbvbnnrmlwwkeikhnnmlfspjgmcxwbjyhomfjdcnogqjviggklplpznfwjydkxzjkoskvqvnxfzdrsmooyciwulvtlmvnjbbmffureoilszlonibbcwfsjzguxqrjwypwrskhrttvnqoqisdfuifqnabzbvyzgbxfvmcomneykfmycevnrcsyqclamfxskmsxreptpxqxqidvjbuduktnwwoztvkuebfdigmjqfuolqzvjincchlmbrxpqgguwuyhrdtwqkdlqidlxzqktgzktihvlwsbysjeykiwokyqaskjjngovbagspyspeghutyoeahhgynzsyaszlirmlekpboywqdliumihwnsnwjc";
        long before = System.currentTimeMillis();
        System.out.println(longestPalindrome(str));
        System.out.println(System.currentTimeMillis() - before);
    }

    //Brute force
//    public static String longestPalindrome(String s) {
//        char charArray[] = s.toCharArray();
//        if (s.length() == 1 || (s.length() == 0))
//            return s;
//        int maxLength = Integer.MIN_VALUE;
//        int begin = 0, end = 0;
//        for (int i = 0; i < charArray.length; i++) {
//            for (int j = i; j < charArray.length + 1; j++) {
//                if (isPalindrome(s.substring(i, j))) {
//                    if ((j - i) > maxLength) {
//                        begin = i;
//                        end = j;
//                        maxLength = j - i;
//                    }
//                }
//            }
//        }
//        return s.substring(begin, end);
//    }
//
//    public static boolean isPalindrome(String s) {
//        char subArray[] = s.toCharArray();
//        for (int i = 0; i < subArray.length; i++) {
//            if (!(subArray[i] == subArray[subArray.length - i - 1])) {
//                return false;
//            }
//        }
//        return true;
//    }

    //Dynamic programming
    public static String longestPalindrome(String s) {
        String res = "";
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1]);
                if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
