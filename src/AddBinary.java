public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1111", "1111"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            sum += carry;
            stringBuilder.append(sum % 2);
            if (sum >= 2) {
                carry = 1;
            } else {
                carry = 0;
            }
        }
        if (carry == 1) stringBuilder.append(carry);
        return stringBuilder.reverse().toString();
    }

}
