import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void findSubsets(int[] nums, int index,
                                   List<Integer> current,
                                   List<List<Integer>> result) {

        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Do not include current element
        findSubsets(nums, index + 1, current, result);

        // Include current element
        current.add(nums[index]);

        findSubsets(nums, index + 1, current, result);

        current.remove(current.size() - 1);
    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        findSubsets(nums, 0, new ArrayList<>(), result);

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        System.out.println(subsets(nums));
    }
}