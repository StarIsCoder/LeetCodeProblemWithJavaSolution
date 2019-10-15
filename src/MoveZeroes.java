public class MoveZeroes {
    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void moveZeroes(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[j] != 0) {
//                        nums[i] = nums[j];
//                        nums[j] = 0;
//                        break;
//                    }
//                }
//            }
//        }
        //move non-zero numbers to previous position, then fill up will zeros for the rest
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
