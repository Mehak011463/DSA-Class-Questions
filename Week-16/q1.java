
import java.util.*;

public class q1 {

    public static long maxCircularSum(long[] nums, int n) {
        long total = 0;

        long keep = nums[0], delete = Long.MIN_VALUE / 2;
        long answer = nums[0];

        long maxEnding = nums[0];
        long maxSum = nums[0];
        long minEnding = nums[0], minSum = nums[0];

        total = nums[0];

        for (int i = 1; i < n; i++) {
            long x = nums[i];
            total += x;

            delete = Math.max(delete + x, keep);
            keep = Math.max(x, keep + x);

            answer = Math.max(answer, Math.max(keep, delete));

            maxEnding = Math.max(x, maxEnding + x);
            maxSum = Math.max(maxSum, maxEnding);

            minEnding = Math.min(x, minEnding + x);
            minSum = Math.min(minSum, minEnding);
        }

        long circularSum;

        if (minSum == total) {
            circularSum = maxSum;
        } else {
            circularSum = total - minSum;
        }

        answer = Math.max(answer, circularSum);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }

        System.out.println(maxCircularSum(nums, n));
        sc.close();
    }
}
