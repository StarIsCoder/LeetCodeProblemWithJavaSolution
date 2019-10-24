/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/

import java.util.Arrays;

public class FindFirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] input = {2, 2};
        int[] output = searchRange(input, 8);
        for (int i : output) {
//            System.out.println(i);
        }
        System.out.println(firstIndex(input, 2));
        System.out.println(lastIndex(input, 2));
    }

    static public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = firstIndex(nums, target);
        result[1] = lastIndex(nums, target);
        return result;
    }


    static int firstIndex(int[] input, int target) {
        int l = 0;
        int r = input.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (input[mid] == target) {
                if (mid == 0) {
                    return mid;
                } else if (input[mid - 1] != target) {
                    return mid;
                } else {
                    r = mid - 1;
                }
            } else if (target > input[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    static int lastIndex(int[] input, int target) {
        int l = 0;
        int r = input.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (input[mid] == target) {
                if (mid == input.length - 1) {
                    return mid;
                } else if (input[mid + 1] != target) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (target > input[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
