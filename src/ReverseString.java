import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("wangshenxing"));

    }

    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
