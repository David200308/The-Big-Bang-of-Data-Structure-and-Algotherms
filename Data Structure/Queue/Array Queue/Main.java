public class Main {
    public static void main(String[] args) {
        System.out.println("Array Based Queue:");
        ArrayQueue arrayqueue = new ArrayQueue();
        System.out.println(arrayqueue.isEmpty());
        arrayqueue.enqueue(10);
        arrayqueue.enqueue(20);
        arrayqueue.enqueue(30);
        arrayqueue.enqueue(40);
        System.out.println(arrayqueue.toString());
        System.out.println(arrayqueue.dequeue());
        System.out.println(arrayqueue.toString());
        arrayqueue.enqueue(50);
        System.out.println(arrayqueue.toString());
        System.out.println(arrayqueue.isFull());

    }
}
