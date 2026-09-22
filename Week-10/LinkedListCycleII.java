public class LinkedListCycleII {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node detectCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                Node current = head;

                while (current != slow) {
                    current = current.next;
                    slow = slow.next;
                }

                return current;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Node head = new Node(3);
        Node second = new Node(2);
        Node third = new Node(0);
        Node fourth = new Node(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        Node cycleStart = detectCycle(head);

        if (cycleStart != null) {
            System.out.println(
                    "Cycle starts at: " + cycleStart.data
            );
        }
        else {
            System.out.println("No cycle");
        }
    }
}