public class JosephusProblem {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static int josephus(int n, int k) {

        Node head = new Node(1);
        Node current = head;

        for (int i = 2; i <= n; i++) {

            current.next = new Node(i);
            current = current.next;
        }

        current.next = head;

        Node previous = current;
        current = head;

        while (current.next != current) {

            for (int count = 1; count < k; count++) {
                previous = current;
                current = current.next;
            }

            previous.next = current.next;
            current = current.next;
        }

        return current.data;
    }

    public static void main(String[] args) {

        int n = 7;
        int k = 3;

        System.out.println(
                "Survivor = " + josephus(n, k)
        );
    }
}