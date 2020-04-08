public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] input = {0, 1, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(input));
    }

    public static int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums) {
            if (n != nums[i - 1]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}
