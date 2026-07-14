public class FindMiddleServer {

    // Node class
    static class Node {
        String serverName;
        Node next;

        Node(String serverName) {
            this.serverName = serverName;
            this.next = null;
        }
    }

    // Find the middle server
    public static Node findMiddleServer(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Display the server chain
    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.serverName + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating server chain:
        // Server1 -> Server2 -> Server3 -> Server4 -> Server5

        Node head = new Node("Server1");
        head.next = new Node("Server2");
        head.next.next = new Node("Server3");
        head.next.next.next = new Node("Server4");
        head.next.next.next.next = new Node("Server5");

        System.out.println("Server Chain:");
        display(head);

        Node middle = findMiddleServer(head);

        System.out.println("Middle Server: " + middle.serverName);
    }
}