import java.util.LinkedList;
import java.util.Queue;

//A shift on A consists of taking string A and moving the leftmost character to the rightmost position.
// For example, if A = 'abcde', then it will be 'bcdea' after one shift on A.
// Return True if and only if A can become B after some number of shifts on A.

public class ShiftString {
    public boolean rotateString(String A, String B) {
        if (A.isEmpty() && B.isEmpty()) return true;
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) return true;
            A = shiftString(A);
        }
        // return A.length() == B.length() && (A + A).contains(B);
        return false;
    }


    public String shiftString(String str) {
        char array[] = str.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        for (char c : array) {
            queue.add(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        char first = ((LinkedList<Character>) queue).pollFirst();
        for (char c : queue) {
            stringBuilder.append(c);
        }
        stringBuilder.append(first);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ShiftString shiftString = new ShiftString();
        System.out.println(shiftString.rotateString("abcde", "cdeab"));

    }
}
