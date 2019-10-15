import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abccbbcda"));
    }

    public static int lengthOfLongestSubstring(String s) {
        //Sliding window use HashSet
        //From 0 to j,calculate ans
        //From 1 to j,calculate ans
        //From 2 to j,calculate ans
        //......
        //From i to j,calculate ans
//        int n = s.length();
//        Set<Character> set = new HashSet<>();
//        int ans = 0, i = 0, j = 0;
//        while (i < n && j < n) {
//            if (!set.contains(s.charAt(j))) {
//                set.add(s.charAt(j++));
//                ans = Math.max(ans, j - i);
//            } else {
//                set.remove(s.charAt(i++));
//            }
//        }
//        return ans;
        //Sliding window use HashMap
        int n = s.length();
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i +1);
            map.put(s.charAt(j), j+1);
        }
        return ans;
    }
}
