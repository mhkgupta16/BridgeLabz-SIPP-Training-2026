public class MergeSortedLogStreams {

    // Node class
    static class Node {
        int timestamp;
        Node next;

        Node(int timestamp) {
            this.timestamp = timestamp;
            this.next = null;
        }
    }

    // Merge two sorted linked lists
    public static Node mergeLogStreams(Node a, Node b) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {

            if (a.timestamp <= b.timestamp) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        // Attach the remaining nodes
        if (a != null) {
            tail.next = a;
        } else {
            tail.next = b;
        }

        return dummy.next;
    }

    // Display the merged log stream
    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.timestamp + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // First sorted log stream
        Node a = new Node(1);
        a.next = new Node(3);
        a.next.next = new Node(5);
        a.next.next.next = new Node(7);

        // Second sorted log stream
        Node b = new Node(2);
        b.next = new Node(4);
        b.next.next = new Node(6);
        b.next.next.next = new Node(8);

        System.out.println("Log Stream 1:");
        display(a);

        System.out.println("Log Stream 2:");
        display(b);

        Node merged = mergeLogStreams(a, b);

        System.out.println("Merged Log Stream:");
        display(merged);
    }
}