public class Main {
    public static void main(String[] args) {
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