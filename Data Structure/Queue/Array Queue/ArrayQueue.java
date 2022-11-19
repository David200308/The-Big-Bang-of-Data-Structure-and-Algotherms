import java.util.Arrays;

public class ArrayQueue {
    int size = 5;
    private int[] items = new int[size];
    private int front, rear, count;

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        items[rear++] = item;
        count++;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return items.length == count;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        var item =  items[front];
        items[front++] = 0;
        return item;
    }

    public String toString() {
        return Arrays.toString(items);
    }
}
