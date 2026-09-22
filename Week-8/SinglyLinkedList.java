public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void add(int data) {

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
    }

    public void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public int countNodes() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public boolean search(int target) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == target) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public int findMiddle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public void reverse() {

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node nextNode = current.next;

            current.next = previous;
            previous = current;
            current = nextNode;
        }

        head = previous;
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.print("List: ");
        list.printList();

        System.out.println("Number of nodes: " + list.countNodes());

        System.out.println("Search 30: " + list.search(30));

        System.out.println("Middle element: " + list.findMiddle());

        list.reverse();

        System.out.print("Reversed list: ");
        list.printList();
    }
}