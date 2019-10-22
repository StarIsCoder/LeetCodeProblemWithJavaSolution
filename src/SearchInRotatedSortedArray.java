import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums, 0));
    }

    static public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int a = binarySearch(Arrays.copyOfRange(nums, 0, pivot), target);
        if (a != -1) {
            return a;
        }
        int b = binarySearch(Arrays.copyOfRange(nums, pivot, nums.length), target);
        if (b != -1) {
            return b + pivot;
        }
        return -1;
    }

    static public int findPivot(int[] nums) {
        int bench = nums[0];
        int i = 1;
        while (i < nums.length) {
            if (bench < nums[i])
                i++;
            else
                break;
        }
        return i;
    }

    static int binarySearch(int[] input, int target) {
        int l = 0;
        int r = input.length - 1;
        while (l <= r) {
            int tmp = (l + r) / 2;
            int value = input[tmp];
            if (value == target) {
                return tmp;
            }
            if (value > target)
                r = tmp - 1;
            else
                l = tmp + 1;
        }
        return -1;
    }
}
