public class SearchCircularList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean search(Node head, int target) {

        if (head == null) {
            return false;
        }

        Node current = head;

        do {

            if (current.data == target) {
                return true;
            }

            current = current.next;

        } while (current != head);

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;
        third.next = head;

        int target = 20;

        System.out.println(
                "Element found: " + search(head, target)
        );
    }
}