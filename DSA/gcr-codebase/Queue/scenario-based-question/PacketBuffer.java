class PacketBuffer {

    int[] data;
    int front;
    int count;

    // Constructor
    PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    // Enqueue
    boolean enqueue(int packetId) {

        if (count == data.length) {
            System.out.println("Buffer is Full");
            return false;
        }

        int rear = (front + count) % data.length;
        data[rear] = packetId;
        count++;

        return true;
    }

    // Dequeue
    int dequeue() {

        if (isEmpty()) {
            System.out.println("Buffer is Empty");
            return -1;
        }

        int value = data[front];

        front = (front + 1) % data.length;
        count--;

        return value;
    }

    // Peek
    int peek() {

        if (isEmpty()) {
            return -1;
        }

        return data[front];
    }

    // Check Empty
    boolean isEmpty() {
        return count == 0;
    }

    // Display Queue
    void display() {

        if (isEmpty()) {
            System.out.println("Buffer is Empty");
            return;
        }

        System.out.print("Packets: ");

        for (int i = 0; i < count; i++) {
            System.out.print(data[(front + i) % data.length] + " ");
        }

        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        PacketBuffer buffer = new PacketBuffer(5);

        buffer.enqueue(101);
        buffer.enqueue(102);
        buffer.enqueue(103);

        buffer.display();

        System.out.println("Processed Packet: " + buffer.dequeue());

        buffer.display();

        buffer.enqueue(104);
        buffer.enqueue(105);
        buffer.enqueue(106);

        buffer.display();

        System.out.println("Front Packet: " + buffer.peek());
    }
}