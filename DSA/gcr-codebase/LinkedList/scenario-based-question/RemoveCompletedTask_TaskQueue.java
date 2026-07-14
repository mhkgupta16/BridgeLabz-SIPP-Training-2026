public class RemoveCompletedTask_TaskQueue {

    // Node class
    static class Node {
        int taskId;
        Node next;

        Node(int taskId) {
            this.taskId = taskId;
            this.next = null;
        }
    }

    // Remove completed task
    public static Node removeTask(Node head, int taskId) {

        if (head == null) {
            return null;
        }

        // If the first node is the task to remove
        if (head.taskId == taskId) {
            return head.next;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.taskId != taskId) {
            prev = curr;
            curr = curr.next;
        }

        // Task found
        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    // Display task queue
    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.taskId + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating task queue: 101 -> 102 -> 103 -> 104
        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        head.next.next.next = new Node(104);

        System.out.println("Original Task Queue:");
        display(head);

        // Remove completed task
        head = removeTask(head, 103);

        System.out.println("Task Queue After Removing Task 103:");
        display(head);
    }
}