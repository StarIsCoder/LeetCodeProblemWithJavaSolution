/*
    sort array without using library's sort funtion
    FYI: only 3 types
    Input: [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]
*/

public class SortColors {
    public static void main(String[] args) {
        int[] input = {2, 0, 2, 1, 1, 0};
        sortColors(input);
        for (int i : input) {
            System.out.println(i);
        }
    }

    static public void sortColors(int[] nums) {
        // two-pass sort count solution
//        int sum0 = 0;
//        int sum1 = 0;
//        for (int i : nums) {
//            if (i == 0) {
//                sum0++;
//            } else if (i == 1) {
//                sum1++;
//            }
//        }
//        for (int i = 0; i < sum0; i++) {
//            nums[i] = 0;
//        }
//        for (int i = 0 + sum0; i < sum0 + sum1; i++) {
//            nums[i] = 1;
//        }
//        for (int i = sum0 + sum1; i < nums.length; i++) {
//            nums[i] = 2;
//        }

        // one-pass solution
        // if 0 move it to start, if 2 move it to end
        int start = 0;
        int index = 0;
        int end = nums.length - 1;

        while (index <= end) {
            if (nums[index] == 0) {
                if (start != index) {
                    swap(nums, start, index);
                }
                start++;
                index++;
            } else if (nums[index] == 2) {
                swap(nums, end, index);
                end--;
            } else {
                index++;
            }
        }
    }

    static private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
