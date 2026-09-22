public class SwappingNodes {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node swapNodes(Node head, int k) {

        Node first = head;

        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        Node kthFromStart = first;

        Node fast = first;
        Node second = head;

        while (fast.next != null) {
            fast = fast.next;
            second = second.next;
        }

        Node kthFromEnd = second;

        int temp = kthFromStart.data;
        kthFromStart.data = kthFromEnd.data;
        kthFromEnd.data = temp;

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

        head = swapNodes(head, 2);

        printList(head);
    }
}