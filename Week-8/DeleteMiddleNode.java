public class DeleteMiddleNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node deleteMiddle(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node previous = null;

        while (fast != null && fast.next != null) {

            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        previous.next = slow.next;

        return head;
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

        head = deleteMiddle(head);

        printList(head);
    }
}