public class InsertBeginning {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insertAtBeginning(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node current = head;

        while (current.next != head) {
            current = current.next;
        }

        newNode.next = head;
        current.next = newNode;

        return newNode;
    }

    public static void printList(Node head) {

        if (head == null) {
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);

        head.next = second;
        second.next = third;
        third.next = head;

        head = insertAtBeginning(head, 10);

        printList(head);
    }
}