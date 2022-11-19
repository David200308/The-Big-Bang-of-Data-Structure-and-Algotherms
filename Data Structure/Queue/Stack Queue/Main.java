public class Main {
    public static void main(String[] args) {
        System.out.println("Stack Based Queue:");
        StackQueue stackqueue = new StackQueue();
        stackqueue.enqueue(10);
        stackqueue.enqueue(20);
        stackqueue.enqueue(30);
        stackqueue.enqueue(40);
        System.out.println(stackqueue.toString());
        System.out.println(stackqueue.dequeue());
        System.out.println(stackqueue.toString());

    }
}
