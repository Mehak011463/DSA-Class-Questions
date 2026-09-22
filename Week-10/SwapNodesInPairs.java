public class SwapNodesInPairs {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node swapPairs(Node head) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node previous = dummy;

        while (previous.next != null &&
               previous.next.next != null) {

            Node first = previous.next;
            Node second = first.next;

            first.next = second.next;
            second.next = first;
            previous.next = second;

            previous = first;
        }

        return dummy.next;
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

        head = swapPairs(head);

        printList(head);
    }
}