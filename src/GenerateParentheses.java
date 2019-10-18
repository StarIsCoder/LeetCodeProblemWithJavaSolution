/*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

        For example, given n = 3, a solution set is:

        [
        "((()))",
        "(()())",
        "(())()",
        "()(())",
        "()()()"
        ]
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
    public static void main(String[] args) {
        List<String> results = generateParenthesis(3);
        System.out.println(results);
    }

    static public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        // Brute force
//        generateAll(new char[2 * n], 0, results);
        // backtrace
        backtrace(results, "", 0, 0, n);
        return results;
    }

    static public void generateAll(char[] current, int pos, List<String> results) {
        if (current.length == pos) {
            if (isValid(current))
                results.add(new String(current));
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, results);
            current[pos] = ')';
            generateAll(current, pos + 1, results);
        }
    }

    static boolean isValid(char[] current) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < current.length; i++) {
            switch (current[i]) {
                case '(':
                    stack.push(current[i]);
                    break;
                case ')':
                    if (!stack.isEmpty()) {
                        if (stack.peek() == '(')
                            stack.pop();
                        else
                            return false;
                    } else
                        return false;

            }
        }
        return stack.isEmpty();
    }

    static void backtrace(List<String> results, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            results.add(current);
        } else {
            if (open < max) {
                backtrace(results, current + "(", open + 1, close, max);
            }
            if (close < open) {
                backtrace(results, current + ")", open, close + 1, max);
            }
        }
    }
}
