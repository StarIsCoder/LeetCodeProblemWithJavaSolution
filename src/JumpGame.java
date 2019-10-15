public class JumpGame {
    /*
        Given an array of non-negative integers, you are initially positioned at the first index of the array.

        Each element in the array represents your maximum jump length at that position.

        Determine if you are able to reach the last index.

        [2,3,1,1,4]  ===>   true

        [3,2,1,0,4]  ===>   false
    */
    public static void main(String[] args) {

    }

    public static boolean canJump(int[] nums) {
        //Recursive
        //return canJumpFromPosition(0, nums);

        //Greedy
        int lastPos = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }


    public static boolean canJumpFromPosition(int position, int[] nums) {
        if (position == nums.length - 1) {
            return true;
        }
        int furthestJumpPosition = Math.min(position + nums[position], nums.length - 1);
        for (int i = position + 1; i < furthestJumpPosition; i++) {
            if (canJumpFromPosition(i, nums)) return true;
        }
        return false;
    }
}
