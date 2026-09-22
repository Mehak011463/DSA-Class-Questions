public class RecursionPatterns {

    // Fibonacci
    public static int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Head Recursion
    public static void headRecursion(int n) {

        if (n == 0) {
            return;
        }

        headRecursion(n - 1);

        System.out.print(n + " ");
    }

    // Tail Recursion
    public static void tailRecursion(int n) {

        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        tailRecursion(n - 1);
    }

    // Generate substrings
    public static void substrings(String str) {

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                System.out.println(str.substring(i, j));
            }
        }
    }

    // Generate subsequences
    public static void subsequences(String str, int index,
                                    String current) {

        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Do not include current character
        subsequences(str, index + 1, current);

        // Include current character
        subsequences(
            str,
            index + 1,
            current + str.charAt(index)
        );
    }

    public static void main(String[] args) {

        System.out.println("Fibonacci:");
        System.out.println(fibonacci(6));

        System.out.println("\nHead Recursion:");
        headRecursion(5);

        System.out.println("\n\nTail Recursion:");
        tailRecursion(5);

        System.out.println("\n\nSubstrings:");
        substrings("abc");

        System.out.println("\nSubsequences:");
        subsequences("abc", 0, "");
    }
}