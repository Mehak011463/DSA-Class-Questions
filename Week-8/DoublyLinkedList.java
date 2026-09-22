public class DoublyLinkedList {

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.previous = temp;
    }

    public void delete(int data) {

        Node temp = head;

        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        if (temp.previous != null) {
            temp.previous.next = temp.next;
        }
        else {
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.previous = temp.previous;
        }
    }

    public void printForward() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public void printBackward() {

        if (head == null) {
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.previous;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.print("Forward: ");
        list.printForward();

        System.out.print("Backward: ");
        list.printBackward();

        list.delete(30);

        System.out.print("After deletion: ");
        list.printForward();
    }
}