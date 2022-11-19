class Node {
    int value;
    Node next;
}

public class LinkedListStack {
    private Node top;
    private int NodeSize;

    public LinkedListStack() {
        this.top = null;
        this.NodeSize = 0;
    }

    public void push(int value) {
        Node node = new Node();
        if (node == null) {
            throw new IllegalStateException();
        }

        node.value = value;
        node.next = top;
        top = node;
        this.NodeSize++;
    }

    public int peek() {
        Node node = new Node();
        if (node == null) {
            throw new IllegalStateException();
        }
        return top.value;
    }

    public int pop() {
        Node node = new Node();
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        int top = peek();
        this.NodeSize--;
        this.top = (this.top).next;
        System.out.print("Removing ");
        return top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return NodeSize;
    }
}


// 20, 50, 80, 40, 60, 75