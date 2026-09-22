import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AddToArrayForm {

    public static List<Integer> addToArrayForm(int[] num, int k) {

        ArrayList<Integer> result = new ArrayList<>();

        int i = num.length - 1;
        int carry = k;

        while (i >= 0 || carry > 0) {

            if (i >= 0) {
                carry += num[i];
                i--;
            }

            result.add(carry % 10);
            carry /= 10;
        }

        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {

        int[] num = {1, 2, 0, 0};
        int k = 34;

        System.out.println(addToArrayForm(num, k));
    }
}