class Node {
    int value;
    Node next;

    public Node (int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedListQueue {
    Node front;
    Node rear;

    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if (this.rear == null) {
            this.rear = this.front = node;
            return;
        }
        this.rear.next = node;
        this.rear = node;
    }

    public void dequeue() {
        if (this.rear == null) {
            throw new IllegalStateException();
        }
        if (this.front == null) {
            return;
        }

        Node node = this.front;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int front() {
        return this.front.value;
    }

    public int rear() {
        return this.rear.value;
    }
}
