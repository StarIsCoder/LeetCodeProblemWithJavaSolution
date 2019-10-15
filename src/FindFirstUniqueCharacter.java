import java.util.HashMap;

public class FindFirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char array[] = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        System.out.println(map);
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

}
