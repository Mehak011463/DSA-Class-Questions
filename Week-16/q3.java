
import java.util.*;

public class q3 {

    static class Node {
        long data;
        Node left, right;

        Node(long data) {
            this.data = data;
        }
    }

    static long NEG = Long.MIN_VALUE / 4;

    public static long maxDown(Node root) {
        if (root == null) return NEG;

        if (root.left == null && root.right == null)
            return root.data;

        long left = maxDown(root.left);
        long right = maxDown(root.right);

        return root.data + Math.max(left, right);
    }

    public static long maxPathSum(Node root) {
        if (root == null || root.left == null || root.right == null)
            return NEG;

        long left = maxDown(root.left);
        long right = maxDown(root.right);

        return root.data + left + right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] values = new String[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.next();
        }

        if (values[0].equals("N")) {
            System.out.println("IMPOSSIBLE");
            sc.close();
            return;
        }

        Node root = new Node(Long.parseLong(values[0]));
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int i = 1;

        while (!q.isEmpty() && i < n) {
            Node curr = q.poll();

            if (i < n && !values[i].equals("N")) {
                curr.left = new Node(Long.parseLong(values[i]));
                q.offer(curr.left);
            }
            i++;

            if (i < n && !values[i].equals("N")) {
                curr.right = new Node(Long.parseLong(values[i]));
                q.offer(curr.right);
            }
            i++;
        }

        if (root.left == null || root.right == null) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(maxPathSum(root));
        }

        sc.close();
    }
}
