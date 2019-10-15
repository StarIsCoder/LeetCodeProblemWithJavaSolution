import java.util.Set;
import java.util.TreeSet;

public class FindSingleNumber {
    public static void main(String[] args) {
        int array[] = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(array));
    }

    public static int singleNumber(int[] nums) {
        //User Set feature
//        Set<Integer> set = new TreeSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!set.add(nums[i])) {
//                set.remove(nums[i]);
//            }
//        }
//        return ((TreeSet<Integer>) set).last();
        //A ^ A = 0
        //A ^ 0 = A
        //A1 ^ A2 ^ A3 ^ A4 ^ A2 ^ A3 ^ A4 = (A2 ^ A2) ^ (A3 ^ A3) ^ (A4 ^ A4) ^ A1 = 0 ^ 0 ^ 0 ^ A1 = A1
        for (int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i];
        }
        return nums[0];
    }
}
