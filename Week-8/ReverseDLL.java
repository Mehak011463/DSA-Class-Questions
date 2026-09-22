public class ReverseDLL {

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node reverse(Node head) {

        Node current = head;
        Node newHead = null;

        while (current != null) {

            Node temp = current.previous;

            current.previous = current.next;
            current.next = temp;

            newHead = current;

            current = current.previous;
        }

        return newHead;
    }

    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.previous = head;

        second.next = third;
        third.previous = second;

        head = reverse(head);

        printList(head);
    }
}