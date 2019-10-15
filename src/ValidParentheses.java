import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("]"));

    }

    static public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char array[] = s.toCharArray();
        for (int i = 0; i <= array.length - 1; i++) {
            switch (array[i]) {
                case '{':
                case '[':
                case '(':
                    stack.push(array[i]);
                    break;
                case '}':
                    if (!stack.isEmpty()) {
                        if (stack.peek() == '{') {
                            stack.pop();
                            break;
                        } else
                            return false;
                    } else
                        return false;
                case ']':
                    if (!stack.isEmpty()) {
                        if (stack.peek() == '[') {
                            stack.pop();
                            break;
                        } else
                            return false;
                    } else
                        return false;
                case ')':
                    if (!stack.isEmpty()) {
                        if (stack.peek() == '(') {
                            stack.pop();
                            break;
                        } else
                            return false;
                    } else
                        return false;
            }
        }
        return stack.isEmpty();
    }
}
