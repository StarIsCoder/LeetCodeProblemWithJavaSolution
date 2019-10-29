import sun.tools.jconsole.HTMLPane;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    static List<List<Integer>> results = new ArrayList<>();

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        permute(input);
        System.out.println(results);
    }

    static public List<List<Integer>> permute(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        permute(nums, tmp, 0, new boolean[nums.length]);
        return results;
    }

    static public void permute(int[] nums, List<Integer> tmp, int index, boolean[] used) {
        if (index == nums.length) {
            results.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                tmp.add(nums[i]);
                used[i] = true;
                permute(nums, tmp, index + 1, used);
                used[i] = false;
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}