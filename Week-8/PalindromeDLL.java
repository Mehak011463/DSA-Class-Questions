public class PalindromeDLL {

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isPalindrome(Node head) {

        if (head == null) {
            return true;
        }

        Node left = head;
        Node right = head;

        while (right.next != null) {
            right = right.next;
        }

        while (left != right && left.previous != right) {

            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.previous;
        }

        return true;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(2);
        Node fourth = new Node(1);

        head.next = second;
        second.previous = head;

        second.next = third;
        third.previous = second;

        third.next = fourth;
        fourth.previous = third;

        System.out.println(
                "Palindrome: " + isPalindrome(head)
        );
    }
}