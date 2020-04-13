public class PatternSearch {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issippi"));
    }

    public static int strStr(String haystack, String needle) {
        int[] lps = new int[needle.length()];
        generateLPS(lps, needle);
        int i = 0; // index for haystack
        int j = 0; // index for needle
        while (i < haystack.length()) {
            if (needle.charAt(j) == haystack.charAt(i)) {
                i++;
                j++;
                if (j == needle.length()) {
                    return i - j;
                }
            } else {
                if (j == 0) {
                    i++;
                } else {
                    j = lps[j - 1];
                }
            }


        }
        return -1;
    }

    public static void generateLPS(int[] lps, String needle) {
        int len = 0;
        int needleLen = needle.length();
        lps[0] = 0;
        int i = 1;
        while (i < needleLen) {
            if (needle.charAt(len) == needle.charAt(i)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len == 0) {
                    lps[i] = len;
                    i++;
                } else {
                    len = lps[len - 1];
                }
            }
        }
    }
}

// Brute force
//        if (haystack.length() < needle.length()) return -1;
//        if (needle.isEmpty()) return 0;
//        for (int i = 0; i < haystack.length(); i++) {
//            int j;
//            for (j = 0; j < needle.length(); j++) {
//                if (i + j == haystack.length()) return -1;
//                if (needle.charAt(j) != haystack.charAt(i + j))
//                    break;
//                if (j == needle.length() - 1)
//                    return i;
//            }
//        }
//        return -1;

