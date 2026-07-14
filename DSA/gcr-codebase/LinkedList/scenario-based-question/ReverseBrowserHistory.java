public class ReverseBrowserHistory {

    // Node class
    static class Node {
        String page;
        Node next;

        Node(String page) {
            this.page = page;
            this.next = null;
        }
    }

    // Reverse the browser history
    public static Node reverseHistory(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Display browser history
    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.page + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Browser History:
        // Google -> YouTube -> GitHub -> ChatGPT

        Node head = new Node("Google");
        head.next = new Node("YouTube");
        head.next.next = new Node("GitHub");
        head.next.next.next = new Node("ChatGPT");

        System.out.println("Original Browser History:");
        display(head);

        head = reverseHistory(head);

        System.out.println("Reversed Browser History:");
        display(head);
    }
}