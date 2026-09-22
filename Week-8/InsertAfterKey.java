public class InsertAfterKey {

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insertAfter(Node head, int key, int value) {

        Node current = head;

        while (current != null) {

            if (current.data == key) {

                Node newNode = new Node(value);

                newNode.next = current.next;
                newNode.previous = current;

                if (current.next != null) {
                    current.next.previous = newNode;
                }

                current.next = newNode;

                return head;
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
        head.next = new Node(20);
        head.next.previous = head;

        head.next.next = new Node(30);
        head.next.next.previous = head.next;

        head = insertAfter(head, 20, 25);

        printList(head);
    }
}