import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Heaps heaps = new Heaps();
        heaps.insert(10);
        heaps.insert(5);
        heaps.insert(17);
        heaps.insert(4);
        heaps.insert(22);
        heaps.remove();
        System.out.println("Done");

        // insert: O(n) - O(log n)
        // delete: O(1) - O(log n)
        PriorityQueueWithHeap p_queue = new PriorityQueueWithHeap();
        p_queue.enqueue(30);
        p_queue.enqueue(20);
        p_queue.enqueue(10);
        p_queue.enqueue(5);
        System.out.println(p_queue.dequeue());
    }
}