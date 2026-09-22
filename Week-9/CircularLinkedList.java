public class CircularLinkedList {

    static class Node {
        int data;
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
            newNode.next = head;
            return;
        }

        Node current = head;

        while (current.next != head) {
            current = current.next;
        }

        current.next = newNode;
        newNode.next = head;
    }

    public void printList() {

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

    public void reversePrint() {

        if (head == null) {
            return;
        }

        Node current = head;

        while (current.next != head) {
            current = current.next;
        }

        Node last = current;

        do {
            System.out.print(current.data + " ");

            Node temp = head;

            while (temp.next != current) {
                temp = temp.next;
            }

            current = temp;

        } while (current != last);

        System.out.println(last.data);
    }

    public int findMiddle() {

        if (head == null) {
            return -1;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != head &&
               fast.next.next != head) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.print("List: ");
        list.printList();

        System.out.print("Reverse: ");
        list.reversePrint();

        System.out.println("Middle = " + list.findMiddle());
    }
}