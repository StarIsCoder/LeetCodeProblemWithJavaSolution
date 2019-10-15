import java.util.*;

public class LetterCombinationOfPhoneNumber {
    /*
        Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

        A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

        Input: "23"

        Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
     */
    static Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    static List<String> output = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
//        Recursive version
//        if (!digits.isEmpty()) {
//            backtrack("", digits);
//        }
//        return output;

        //BFS version
        LinkedList<String> tmp = new LinkedList<>();
        if (digits.isEmpty()) return tmp;
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        tmp.add("");
        while (tmp.peek().length() != digits.length()) {
            String previous = tmp.remove();
            String map = mapping[digits.charAt(previous.length()) - '0'];
            for (char c : map.toCharArray()) {
                tmp.addLast(previous + c);
            }
        }
        return tmp;
    }

    public static void backtrack(String combination, String next_digits) {
        if (next_digits.length() == 0) {
            output.add(combination);
        } else {
            String digit = next_digits.substring(0, 1);
            String letters = phone.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = letters.substring(i, i + 1);
                backtrack(combination + letter, next_digits.substring(1));
            }
        }
    }
}
