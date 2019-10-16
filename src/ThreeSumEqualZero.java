/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumEqualZero {
    static int tmp[] = {-1, 0, 1, 2, -1, -4};

    public static void main(String[] args) {
        List<List<Integer>> result = threeSum(tmp);
        for (List list : result) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int start;
        int end;
        for (int i = 0; i < nums.length - 2; i++) {
            start = i + 1;
            end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end];
                if ((sum + nums[i]) == 0) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[start]);
                    tmp.add(nums[end]);
                    tmp.add(nums[i]);
                    if (!result.contains(tmp)) {
                        result.add(tmp);
                    }
                    start++;
                    end--;
                } else if ((sum + nums[i]) < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return result;
    }
}
