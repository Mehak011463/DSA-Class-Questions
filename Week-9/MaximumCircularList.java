public class MaximumCircularList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static int findMaximum(Node head) {

        if (head == null) {
            return Integer.MIN_VALUE;
        }

        int maximum = head.data;
        Node current = head.next;

        while (current != head) {

            if (current.data > maximum) {
                maximum = current.data;
            }

            current = current.next;
        }

        return maximum;
    }

    public static void main(String[] args) {

        Node head = new Node(15);
        Node second = new Node(7);
        Node third = new Node(32);
        Node fourth = new Node(18);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = head;

        System.out.println(
                "Maximum = " + findMaximum(head)
        );
    }
}