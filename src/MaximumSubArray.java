public class MaximumSubArray {
    public static void main(String[] args) {
        int array[] = {-1, 2};
        System.out.println(maxSubArray(array));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSum = Math.max(nums[i], maxSum + nums[i]);
            max = Math.max(maxSum, max);
        }
        return max;
//Brute force approach
//        int sum = 0;
//        int max = nums[0] > 0 ? 0 : nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                sum += nums[j];
//                max = Math.max(sum, max);
//            }
//            sum = 0;
//        }
//        return max;

//Brute force approach backward
//        int sum = 0;
//        int max = nums[0] > 0 ? 0 : nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j >= 0; j--) {
//                sum += nums[j];
//                max = Math.max(sum, max);
//            }
//            sum = 0;
//        }
//        return max;

//        int max = nums[0];
//        int maxSum[] = new int[nums.length];
//        maxSum[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            maxSum[i] = Math.max(nums[i], maxSum[i - 1] + nums[i]);
//            max = Math.max(maxSum[i], max);
//        }
//        return max;
    }
}
