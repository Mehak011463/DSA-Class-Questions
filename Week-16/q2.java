
import java.util.*;

public class q2 {

    public static void firstNonRepeating(int[] nums, int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            q.offer(nums[i]);

            if (i >= k) {
                int removed = nums[i - k];
                freq.put(removed, freq.get(removed) - 1);
            }

            if (i >= k - 1) {
                while (!q.isEmpty() && (freq.getOrDefault(q.peek(), 0) != 1 ||
                        !isInWindow(q.peek(), nums, i, k))) {
                    q.poll();
                }

                if (q.isEmpty()) {
                    System.out.print("-1 ");
                } else {
                    System.out.print(q.peek() + " ");
                }
            }
        }
    }

    public static boolean isInWindow(int value, int[] nums, int end, int k) {
        for (int i = end - k + 1; i <= end; i++) {
            if (nums[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        firstNonRepeating(nums, n, k);
        sc.close();
    }
}
