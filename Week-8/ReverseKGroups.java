public class ReverseKGroups {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node reverseKGroup(Node head, int k) {

        Node current = head;
        int count = 0;

        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        if (count < k) {
            return head;
        }

        Node previous = null;
        current = head;
        count = 0;

        while (current != null && count < k) {

            Node next = current.next;

            current.next = previous;
            previous = current;
            current = next;

            count++;
        }

        head.next = reverseKGroup(current, k);

        return previous;
    }

    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = reverseKGroup(head, 2);

        printList(head);
    }
}