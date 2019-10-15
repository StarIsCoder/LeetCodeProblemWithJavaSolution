public class SearchInsertPosition {
    public static void main(String[] args) {
        //Given a sorted array and a target value, return the index if the target is found.
        //If not, return the index where it would be if it were inserted in order.
        int array[] = {1, 3, 5, 7};
        System.out.println(searchInsert(array, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
