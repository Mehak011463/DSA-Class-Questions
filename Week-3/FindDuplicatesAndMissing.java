public class FindDuplicatesAndMissing {

    public static void findNumbers(int[] arr) {

        int duplicate = -1;
        int missing = -1;

        for (int i = 0; i < arr.length; i++) {

            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                duplicate = Math.abs(arr[i]);
            }
            else {
                arr[index] = -arr[index];
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        System.out.println("Duplicate = " + duplicate);
        System.out.println("Missing = " + missing);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4};

        findNumbers(arr);
    }
}