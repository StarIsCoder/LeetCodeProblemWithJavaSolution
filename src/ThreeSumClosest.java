import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int nums[] = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        //Brute force
//        int ret = Integer.MAX_VALUE;
//        int min = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (ret > Math.abs(nums[i] + nums[j] + nums[k] - target)) {
//                        ret = Math.abs(nums[i] + nums[j] + nums[k] - target);
//                        min = nums[i] + nums[j] + nums[k];
//                    }
//                }
//            }
//        }
//        return min;

        // 1 3 -2 5 8 7 5 2 4
        // |    |     |
        // i  start  end
        //sort the array, if sum larger than target,then we should shift end pointer to left
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }

        }
        return result;
    }
}
