public class HouseRobber {

    public static int rob(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int previous = 0;
        int current = 0;

        for (int money : nums) {

            int newCurrent = Math.max(current, previous + money);

            previous = current;
            current = newCurrent;
        }

        return current;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        System.out.println("Maximum money = " + rob(nums));
    }
}