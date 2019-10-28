/*Given a set of candidate numbers (candidates) (without duplicates) and a target number (target),
 find all unique combinations in candidates where the candidate numbers sums to target.

 The same repeated number may be chosen from candidates unlimited number of times.

 Note:

 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 Input: candidates = [2,3,6,7], target = 7,
 A solution set is:
 [
  [7],
  [2,2,3]
 ]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    static private List<List<Integer>> lists = new ArrayList<>();
    static private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] input = {2,3,6,7};
        List<List<Integer>> results = combinationSum(input,7);
        System.out.println(results);
    }

    static public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinationSum(candidates, 0, target);
        return lists;
    }

    static public void combinationSum(int[] candidates, int index, int target) {
        if (index == candidates.length) return;
        if (target == 0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (target >= candidates[i]) {
                list.add(candidates[i]);
                combinationSum(candidates, i, target - candidates[i]);
                list.remove(list.size() - 1);
            }
        }
    }
}
