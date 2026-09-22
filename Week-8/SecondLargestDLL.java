public class SecondLargestDLL {

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static int secondLargest(Node head) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        Node current = head;

        while (current != null) {

            if (current.data > largest) {

                secondLargest = largest;
                largest = current.data;
            }
            else if (current.data > secondLargest &&
                     current.data != largest) {

                secondLargest = current.data;
            }

            current = current.next;
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(40);
        Node third = new Node(20);
        Node fourth = new Node(30);

        head.next = second;
        second.previous = head;

        second.next = third;
        third.previous = second;

        third.next = fourth;
        fourth.previous = third;

        System.out.println(
                "Second largest = " + secondLargest(head)
        );
    }
}