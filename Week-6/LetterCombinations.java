import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    static String[] letters = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void generate(String digits, int index,
                                String current,
                                List<String> result) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        int number = digits.charAt(index) - '0';

        String possibleLetters = letters[number];

        for (int i = 0; i < possibleLetters.length(); i++) {

            generate(
                digits,
                index + 1,
                current + possibleLetters.charAt(i),
                result
            );
        }
    }

    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        generate(digits, 0, "", result);

        return result;
    }

    public static void main(String[] args) {

        String digits = "23";

        System.out.println(letterCombinations(digits));
    }
}