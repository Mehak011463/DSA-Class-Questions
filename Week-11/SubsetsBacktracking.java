import java.util.*;

public class SubsetsBacktracking {

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        generate(0, nums, new ArrayList<>(), ans);

        return ans;
    }

    static void generate(int index, int[] nums,
                         List<Integer> current,
                         List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);

        generate(index + 1, nums, current, ans);

        current.remove(current.size() - 1);

        generate(index + 1, nums, current, ans);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> ans = subsets(nums);

        System.out.println(ans);
    }
}