import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("MDCXCV"));
    }

    static private int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char charArray[] = s.toCharArray();
        int sum = 0;
        if (charArray.length == 1) {
            sum += map.get(charArray[0]);
            return sum;
        }
        int i = 0;
        while (i <= charArray.length - 1) {
            //The last char
            if (i == charArray.length - 1) {
                sum += map.get(charArray[i]);
                break;
            }
            //process the last two char
            if (i + 1 == charArray.length - 1) {
                if (map.get(charArray[i]) >= map.get(charArray[i + 1])) {
                    sum += map.get(charArray[i + 1]) + map.get(charArray[i]);
                    break;
                } else {
                    sum += map.get(charArray[i + 1]) - map.get(charArray[i]);
                    break;
                }
            }
            if (map.get(charArray[i]) >= map.get(charArray[i + 1])) {
                sum += map.get(charArray[i]);
            } else {
                sum = sum + map.get(charArray[i + 1]) - map.get(charArray[i]);
                i = i + 1;
            }
            i++;
        }
        return sum;
    }
}
