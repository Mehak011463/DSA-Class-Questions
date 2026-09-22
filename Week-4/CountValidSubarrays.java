public class CountValidSubarrays {

    public static int countSubarrays(int[] arr, int limit) {

        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > limit) {
                sum -= arr[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int limit = 3;

        System.out.println("Valid subarrays = "
                + countSubarrays(arr, limit));
    }
}