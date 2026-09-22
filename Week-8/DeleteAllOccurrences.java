public class DeleteAllOccurrences {

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node deleteAll(Node head, int value) {

        Node current = head;

        while (current != null) {

            if (current.data == value) {

                if (current.previous != null) {
                    current.previous.next = current.next;
                }
                else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.previous = current.previous;
                }
            }

            current = current.next;
        }

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

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(20);
        Node fourth = new Node(30);

        head.next = second;
        second.previous = head;

        second.next = third;
        third.previous = second;

        third.next = fourth;
        fourth.previous = third;

        head = deleteAll(head, 20);

        printList(head);
    }
}