import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {
    Queue<Integer> queue_1 = new LinkedList<Integer>();
    Queue<Integer> queue_2 = new LinkedList<Integer>();

    public void push(int item) {
        queue_2.add(item);
        while (!queue_1.isEmpty()) {
            queue_2.add(queue_1.peek());
            queue_1.remove();
        }
        Queue<Integer> queue = queue_1;
        queue_1 = queue_2;
        queue_2 = queue;
    }

    public void pop() {
        if (queue_1.isEmpty()) {
            return;
        }
        queue_1.remove();
    }

    public int top() {
        if (queue_1.isEmpty()) {
            return -1;
        }
        return queue_1.peek();
    }

    public int size() {
        return queue_1.size();
    }

    public String toString() {
        return queue_1.toString();
    }
}
