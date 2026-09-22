public class TwoPointerPairSum {

    public static void findPairs(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);
                left++;
                right--;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 8, 9};
        int target = 10;

        findPairs(arr, target);
    }
}