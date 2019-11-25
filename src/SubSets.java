/* Given a set of distinct integers, nums, return all possible subsets (the power set)

Input: nums = [1,2,3]
        Output:
        [
        [3],
        [1],
        [2],
        [1,2,3],
        [1,3],
        [2,3],
        [1,2],
        []
        ]
*/
import java.util.ArrayList;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        System.out.println(subsets(input));
    }

    static public List<List<Integer>> subsets(int[] nums) {
        // Round 0 : []
        // Round 1 : [],[1]
        // Round 2 : [],[1],[2],[1,2]
        // Round 3 : [],[1],[2],[1,2],[3], [1, 3], [2, 3], [1, 2, 3]
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> tmp = new ArrayList<>();
            for (List<Integer> list : result) {
                list = new ArrayList<>(list);
                list.add(nums[i]);
                tmp.add(list);
            }
            result.addAll(tmp);
        }
        return result;
    }
}