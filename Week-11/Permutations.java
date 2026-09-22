import java.util.*;

public class Permutations {

    static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        boolean[] used = new boolean[nums.length];

        generate(nums, used, new ArrayList<>(), ans);

        return ans;
    }

    static void generate(int[] nums,
                         boolean[] used,
                         List<Integer> current,
                         List<List<Integer>> ans) {

        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (!used[i]) {

                used[i] = true;
                current.add(nums[i]);

                generate(nums, used, current, ans);

                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> ans = permute(nums);

        System.out.println(ans);
    }
}